package com.infinitevoid.dagger2tutorial.di

import com.infinitevoid.dagger2tutorial.MainActivity
import dagger.Component

@Component(modules = [InfoModule::class])
interface InfoComponent {
    fun inject(myTarget: MainActivity)
}