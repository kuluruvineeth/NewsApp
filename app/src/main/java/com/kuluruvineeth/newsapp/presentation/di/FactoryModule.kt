package com.kuluruvineeth.newsapp.presentation.di

import android.app.Application
import com.kuluruvineeth.newsapp.domain.usecase.GetNewsHeadlinesUseCase
import com.kuluruvineeth.newsapp.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase
    ):NewsViewModelFactory{
        return NewsViewModelFactory(application,getNewsHeadlinesUseCase)
    }
}