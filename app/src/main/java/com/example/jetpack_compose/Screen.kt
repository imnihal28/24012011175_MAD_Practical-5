package com.example.jetpack_compose

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Registration : Screen("registration")
    object CheckBoxLevel : Screen("checkbox_level")
}
