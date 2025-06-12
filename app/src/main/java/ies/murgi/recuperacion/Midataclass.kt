package ies.murgi.recuperacion

import androidx.compose.runtime.mutableStateOf

data class Midataclass(val title: String, var isChecked: Boolean = false) {
    var isCheckedState = mutableStateOf(isChecked)
}
