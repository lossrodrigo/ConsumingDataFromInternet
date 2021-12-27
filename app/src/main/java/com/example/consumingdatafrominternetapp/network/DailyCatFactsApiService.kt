package com.example.consumingdatafrominternetapp.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


private const val BASE_URL = "https://cat-fact.herokuapp.com"

//moshi
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

//retrofit object
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

//retrofit service interface
interface DailyCatFactsApiService{

    @GET("facts")
    suspend fun getCatFacts(): List<CatFacts>
}

// retrofit service object
object DailyCatFactsApi {
    val retrofitService: DailyCatFactsApiService by lazy { retrofit.create(DailyCatFactsApiService::class.java) }
}
