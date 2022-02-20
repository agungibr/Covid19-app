package com.example.retrofit2_03_agung.api

import com.example.retrofit2_03_agung.model.IndonesiaResponse
import com.example.retrofit2_03_agung.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}