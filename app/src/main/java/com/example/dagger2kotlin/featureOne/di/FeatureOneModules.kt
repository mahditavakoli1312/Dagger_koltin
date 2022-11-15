package com.example.dagger2.feature.featureOne.di

import com.example.dagger2.feature.featureOne.data.ChildB
import com.example.dagger2.feature.featureOne.data.ChildC
import com.example.dagger2.feature.featureOne.data.ParentA
import dagger.Module
import dagger.Provides

@Module
class FeatureOneModules {

    @Provides
    fun provideParentA(childB: ChildB): ParentA = ParentA(childB)

    @Provides
    fun provideChildB(childC: ChildC): ChildB = ChildB(childC)

    @Provides
    fun provideChildC(): ChildC = ChildC()
}