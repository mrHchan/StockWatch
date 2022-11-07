package com.stockwatch.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListing(
        @Query("apikey") apiKey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "Q63Y9NX3TUF587NF"
        const val BASE_URL = "https://alphavantage.co"
    }
}