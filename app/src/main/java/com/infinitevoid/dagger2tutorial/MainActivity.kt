package com.infinitevoid.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.infinitevoid.dagger2tutorial.di.DaggerInfoComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var info2: Info2

    init {
        DaggerInfoComponent.create().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcome_text.text = info2.info()
    }
}
