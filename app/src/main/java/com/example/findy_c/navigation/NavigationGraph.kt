package com.example.findy_c.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.findy.composegooglemaps.compose.MapScreen
import com.example.findy.navigation.Screens
import com.example.findy.presentation.login_screen.SignInScreen
import com.example.findy.presentation.signup_screen.SignUpScreen
import com.example.findy_c.ui.theme.FriendsScreen


@Composable
fun NavigationGraph(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = Screens.SignInScreen.route
    ) {
        composable(route = Screens.SignInScreen.route) {
            SignUpScreen( navController= navController)
        }
        composable(route = Screens.SignUpScreen.route) {
            SignInScreen(navController = navController)

        }
        composable(route = Screens.FriendsScreen.route){
            FriendsScreen(navController = navController)
        }
        composable(route = Screens.MapScreen.route) {
            MapScreen()
        }
    }

}