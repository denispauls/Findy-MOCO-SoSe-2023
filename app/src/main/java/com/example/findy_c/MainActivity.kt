package com.example.FindY


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.findy_c.ui.theme.FindY_CTheme
import com.example.findy_c.navigation.NavigationGraph

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            FindY_CTheme {
                navController = rememberNavController()
                NavigationGraph(navController)
            }
        }
    }
}
//@Composable
//fun NavigationView() {
//    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = "home") {
//        composable("home") {
//            //Login( onItemClick = {navController.navigate("friends")})
//
//        }
//        composable("friends") {
//            //FriendsScreen(
//            //    onHome = { navController.popBackStack() })
//
//        }
//
//    }
//}
