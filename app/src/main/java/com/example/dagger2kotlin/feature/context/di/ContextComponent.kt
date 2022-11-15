package com.example.dagger2kotlin.feature.context.di

import android.content.Context
import com.example.dagger2kotlin.DaggerApp
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [ContextModules::class]
)
interface ContextComponent {
    fun context(): Context

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance
            app: DaggerApp
        ): ContextComponent
    }
}