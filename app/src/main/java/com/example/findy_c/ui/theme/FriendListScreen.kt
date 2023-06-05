package com.example.findy_c.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.findy_c.Screens

@Composable
fun ProfileCard(navController: NavController) {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(Color.Gray),
        border = BorderStroke(1.dp, color = Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clickable { navController.navigate(route = Screens.Map.route) }
    ) {
        Row {
            Icon(
                Icons.Rounded.AccountCircle,
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
            Column(Modifier.padding(6.dp)) {
                Text(
                    text = "Name Surname",
                    fontSize = 18.sp
                )
                Text(
                    text = "Bio/Last online",
                    fontSize = 14.sp
                )
            }
        }
    }
}
@Composable
fun FriendsScreen(navController: NavController){
    Surface(color = Color.Gray,
        modifier = Modifier.verticalScroll(rememberScrollState())) {
    }

    Box(Modifier.padding(top = 6.dp, start = 6.dp, end = 6.dp)){
        LazyColumn(
            Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(6.dp))
        {
            items(20){ProfileCard(navController)
            }
        }
        Icon(
            Icons.Rounded.MoreVert, null,
            Modifier
                .size(35.dp)
                .align(Alignment.TopEnd))
    }
}
@Composable
@Preview(showBackground = true)
fun PreviewFriendScreen(){
    FriendsScreen(
        navController = rememberNavController()
    )
}