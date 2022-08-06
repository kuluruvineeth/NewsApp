package com.kuluruvineeth.newsapp.presentation.di

import com.kuluruvineeth.newsapp.data.api.NewsAPIService
import com.kuluruvineeth.newsapp.data.repository.dataSource.NewsRemoteDataSource
import com.kuluruvineeth.newsapp.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService):NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}