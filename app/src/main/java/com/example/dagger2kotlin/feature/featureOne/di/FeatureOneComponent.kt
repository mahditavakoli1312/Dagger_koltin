package com.example.dagger2.feature.featureOne.di

import com.example.dagger2kotlin.feature.context.di.ContextComponent
import com.example.dagger2kotlin.feature.featureOne.OneFragment
import dagger.Component

@Component(
    modules = [FeatureOneModules::class],
    dependencies = [ContextComponent::class]
)
interface FeatureOneComponent {
    fun inject(mainActivity: OneFragment)

    @Component.Factory
    interface Factory {
        fun create(
            contextComponent: ContextComponent
        ): FeatureOneComponent
    }
}