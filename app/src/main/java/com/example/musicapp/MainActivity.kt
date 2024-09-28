package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("https://deezerdevs-deezer.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData("eminem")

        retrofitData.enqueue(object : Callback<MyData> {
            override fun onResponse(p0: Call<MyData>, p1: Response<MyData>) {
              val dataList = response.body()
                val textView= findViewById<TextView>(R.id.helloText)
                textView.text= dataList.toString()
                Log.d("Tag:onResponse", "onResponse:"+respose.body())
            }

            override fun onFailure(p0: Call<MyData>, p1: Throwable) {
                Log.d("TAG: onFailure", "onFailure: " + t.message)
            }
        })




    }
}