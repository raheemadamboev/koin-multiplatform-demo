package xyz.teamgravity.koinmultiplatformdemo.injection.provide

import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import xyz.teamgravity.koinmultiplatformdemo.data.local.MyDatabase

actual val platformModule: Module = module {
    singleOf(::MyDatabase)
}