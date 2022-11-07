package com.stockwatch.domain.repository

import com.stockwatch.domain.model.CompanyListing
import com.stockwatch.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}