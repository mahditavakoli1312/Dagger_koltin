package com.example.dagger2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger2.feature.featureOne.data.ChildB
import com.example.dagger2.feature.featureOne.data.ChildC
import com.example.dagger2.feature.featureOne.data.ParentA
import com.example.dagger2.feature.featureOne.di.DaggerFeatureOneComponent
import com.example.dagger2.feature.featureOne.di.FeatureOneModules
import javax.inject.Inject

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var parentA: ParentA
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        DaggerFeatureOneComponent.factory().create(
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