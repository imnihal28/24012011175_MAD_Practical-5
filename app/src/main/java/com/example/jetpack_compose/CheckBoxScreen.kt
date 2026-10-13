package com.example.jetpack_compose

import androidx.compose.runtime.Composable

@Composable
fun CheckBoxScreen(
    onLogout: () -> Unit = {}
) {
    CheckBoxLabelScreen(onLogout = onLogout)
}