package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query



interface ApiInterface {

    @Headers("x-rapidapi-key: c6489e48ddmsha853b69a8047671p10db9cjsn0e21d2d471e5",
            "x-rapidapi-host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String) : Call<MyData>

}