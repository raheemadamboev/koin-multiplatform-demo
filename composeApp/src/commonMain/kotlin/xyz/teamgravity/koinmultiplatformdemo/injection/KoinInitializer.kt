package xyz.teamgravity.koinmultiplatformdemo.injection

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import xyz.teamgravity.koinmultiplatformdemo.injection.provide.platformModule
import xyz.teamgravity.koinmultiplatformdemo.injection.provide.sharedModule

fun initializeKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(sharedModule, platformModule)
    }
}