package com.yg.model.di

import com.yg.model.network.BoredAPI
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Singleton
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofitAPI(retrofit: Retrofit) : BoredAPI{
        return retrofit.create(BoredAPI::class.java)
    }

    @Singleton
    @Provides
    fun provideRetrofit(httpClient: OkHttpClient) : Retrofit{
        return  Retrofit.Builder()
            .baseUrl("https://www.boredapi.com/")
            .client(httpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideOKHttpProvider(httpLoggingInterceptor : HttpLoggingInterceptor) : OkHttpClient{
        val client = OkHttpClient.Builder()
        client.addInterceptor(httpLoggingInterceptor)
        return client.build()
    }

    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor() : HttpLoggingInterceptor{
        val v=  HttpLoggingInterceptor()
        v.level = HttpLoggingInterceptor.Level.BODY
        return v
    }

}