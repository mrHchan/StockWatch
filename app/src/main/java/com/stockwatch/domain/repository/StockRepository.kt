package com.stockwatch.domain.repository

import com.stockwatch.domain.model.CompanyInfo
import com.stockwatch.domain.model.CompanyListing
import com.stockwatch.domain.model.IntradayInfo
import com.stockwatch.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}