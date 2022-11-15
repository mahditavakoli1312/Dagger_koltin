package com.example.dagger2kotlin.feature.context.di

import android.app.Application
import android.content.Context
import com.example.dagger2kotlin.DaggerApp
import dagger.Module
import dagger.Provides

@Module
object ContextModules {

    @Provides
    fun provideContext(app: DaggerApp): Context {
        return app.applicationContext

    }

    @Provides
    fun provideApplication(app: DaggerApp): Application {
        return app
    }
}



