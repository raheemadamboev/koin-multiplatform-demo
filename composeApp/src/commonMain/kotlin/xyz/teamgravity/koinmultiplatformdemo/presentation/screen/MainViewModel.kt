package xyz.teamgravity.koinmultiplatformdemo.presentation.screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import xyz.teamgravity.koinmultiplatformdemo.data.repository.Repository

class MainViewModel(
    repository: Repository
) : ViewModel() {

    private val _text = MutableStateFlow(repository.getText())
    val text: StateFlow<String> = _text.asStateFlow()
}