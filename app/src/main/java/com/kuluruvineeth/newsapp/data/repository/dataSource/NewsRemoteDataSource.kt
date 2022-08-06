package com.kuluruvineeth.newsapp.data.repository.dataSource

import com.kuluruvineeth.newsapp.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines():Response<APIResponse>
}