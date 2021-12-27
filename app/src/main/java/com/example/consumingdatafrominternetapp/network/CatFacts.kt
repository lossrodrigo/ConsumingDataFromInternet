package com.example.consumingdatafrominternetapp.network

import com.squareup.moshi.Json

data class CatFacts(@Json(name="_id") val id:String,
                    @Json(name="__v") val v:String,
                    val text:String,
                    val updatedAt: String,
                    val deleted: Boolean,
                    val source: String,
                    val sentCount: String =""
    )
