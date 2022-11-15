package com.example.dagger2kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    /*   @Inject
       lateinit var parentA: ParentA*/

    // in fragment onAttach
    // in Activity attachBaseContext


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}