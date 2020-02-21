package com.infinitevoid.dagger2tutorial

import javax.inject.Inject

class Info2 @Inject constructor(private val info: Info) {
    fun info(): String = "info : ${info.info()}"
}