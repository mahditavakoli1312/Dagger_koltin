package com.example.dagger2kotlin.feature.featureOne

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dagger2.feature.featureOne.data.ParentA
import com.example.dagger2.feature.featureOne.di.DaggerFeatureOneComponent
import com.example.dagger2kotlin.DaggerApp
import com.example.dagger2kotlin.R
import com.example.dagger2kotlin.feature.context.di.DaggerContextComponent
import javax.inject.Inject

private const val TAG = "OneFragment"

class OneFragment : Fragment() {

    @Inject
    lateinit var parentA: ParentA
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)


        val contextComponent = DaggerContextComponent.factory().create(
            (context as Activity).application as DaggerApp
        )

        DaggerFeatureOneComponent.factory().create(
            contextComponent = contextComponent
        ).inject(this)

        Log.d(TAG, "onCreate: ${parentA.name}")
        Log.d(TAG, "onCreate: ${parentA.b.name}")
        Log.d(TAG, "onCreate: ${parentA.b.c.name}")

    }
}