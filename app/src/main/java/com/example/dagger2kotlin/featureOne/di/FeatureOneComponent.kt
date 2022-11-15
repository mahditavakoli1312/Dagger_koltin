package com.example.dagger2.feature.featureOne.di

import android.content.Context
import com.example.dagger2kotlin.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [FeatureOneModules::class]
)
interface FeatureOneComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): FeatureOneComponent
    }
}