package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.domain.repository.NewsRepository

class GetSavedNewsUseCase(
    private val newsRepository: NewsRepository
) {
}