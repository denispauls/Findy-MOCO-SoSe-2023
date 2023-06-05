package com.example.findy_c

sealed class Screens(val route: String) {
    object Login: Screens(route= "login_screen")
    object Friends: Screens(route = "friends_screen")
    object Map: Screens(route = "map_screen")
}