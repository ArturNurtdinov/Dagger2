package com.infinitevoid.dagger2tutorial

import javax.inject.Inject

class Info @Inject constructor(private val id: Int, private val name: String) {
    fun info(): String = "id: $id, name: $name"
}