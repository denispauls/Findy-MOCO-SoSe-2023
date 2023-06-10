package com.example.findy_c.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navigation
import com.example.findy_c.Screens

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screens.Login.route
    ){
        composable(
            route = Screens.Login.route
        ){
           Login(navController = navController)
        }
        composable(
            route = Screens.Friends.route
        ){
            FriendsScreen(navController = navController)
        }
        composable(
            route = Screens.Map.route
        ){
            MapScreen()
        }
    }
}


