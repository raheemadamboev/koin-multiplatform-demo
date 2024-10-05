package xyz.teamgravity.koinmultiplatformdemo.injection.provide

import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import xyz.teamgravity.koinmultiplatformdemo.data.repository.Repository
import xyz.teamgravity.koinmultiplatformdemo.data.repository.RepositoryImp
import xyz.teamgravity.koinmultiplatformdemo.presentation.screen.MainViewModel

val sharedModule: Module = module {
    singleOf(::RepositoryImp).bind<Repository>()
    viewModelOf(::MainViewModel)
}