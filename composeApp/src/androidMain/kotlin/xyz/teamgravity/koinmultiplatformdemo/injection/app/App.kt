package xyz.teamgravity.koinmultiplatformdemo.injection.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import xyz.teamgravity.koinmultiplatformdemo.injection.initializeKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeKoin {
            androidContext(this@App)
        }
    }
}