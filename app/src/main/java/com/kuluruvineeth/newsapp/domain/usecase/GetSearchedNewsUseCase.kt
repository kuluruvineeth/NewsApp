package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.domain.repository.NewsRepository

class GetSearchedNewsUseCase(
    private val newsRepository: NewsRepository
) {
}