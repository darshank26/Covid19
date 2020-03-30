package com.appdid.topautocare.api

import com.darshankomu.covid19.model.Datum
import com.darshankomu.covid19.model.TotalData
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    @get:GET("countries?sort=cases")
    val get_data : Call<List<Datum>>

    @get:GET("all")
    val get_all : Call<TotalData>
}