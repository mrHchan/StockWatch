package com.stockwatch.presentation.company_info

import com.stockwatch.domain.model.CompanyInfo
import com.stockwatch.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
