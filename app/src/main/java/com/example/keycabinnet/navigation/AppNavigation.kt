package com.example.keycabinnet.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.keycabinnet.screen.FirstScreen
import com.example.keycabinnet.screen.LoginScreen
import com.example.keycabinnet.screen.SecondBodyContent
import com.example.keycabinnet.screen.SecondScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreeens.FirstScreen.route){
        composable(route = AppScreeens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreeens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreeens.LoginScreen.route){
            LoginScreen(navController)
        }
    }
}