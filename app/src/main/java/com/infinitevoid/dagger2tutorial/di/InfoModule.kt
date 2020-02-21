package com.infinitevoid.dagger2tutorial.di

import com.infinitevoid.dagger2tutorial.Info
import dagger.Module
import dagger.Provides

@Module
class InfoModule {
    @Provides
    fun createInfo(): Info =
        Info(1, "Some name")
}