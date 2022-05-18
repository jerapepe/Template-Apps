package com.example.keycabinnet.navigation

sealed class AppScreeens(var route: String){
    object FirstScreen: AppScreeens("first_screen")
    object SecondScreen: AppScreeens("second_screen")
    object LoginScreen: AppScreeens("login_screen")
}

