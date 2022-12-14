package com.example.dagger2kotlin

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2.feature.featureOne.data.ParentA
import com.example.dagger2.feature.featureOne.di.DaggerFeatureOneComponent
import javax.inject.Inject

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var parentA: ParentA

    // in fragment onAttach
    // in Activity attachBaseContext
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)

        DaggerFeatureOneComponent.factory().create(
            context = newBase!!
        ).inject(this)

        Log.d(TAG, "onCreate: ${parentA.name}")
        Log.d(TAG, "onCreate: ${parentA.b.name}")
        Log.d(TAG, "onCreate: ${parentA.b.c.name}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}