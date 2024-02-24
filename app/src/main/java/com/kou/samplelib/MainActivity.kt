package com.kou.samplelib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kou.mylibrary.ShowLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ShowLib.shortToast(this, "TEST")
    }
}