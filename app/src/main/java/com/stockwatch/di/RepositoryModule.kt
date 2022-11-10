package com.stockwatch.di

import com.stockwatch.data.csv.CSVParser
import com.stockwatch.data.csv.CompanyListingsParser
import com.stockwatch.data.csv.IntradayInfoParser
import com.stockwatch.data.repository.StockRepositoryImpl
import com.stockwatch.domain.model.CompanyListing
import com.stockwatch.domain.model.IntradayInfo
import com.stockwatch.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}