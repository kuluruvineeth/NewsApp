package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(
    private val newsRepository: NewsRepository
) {
}