package com.example.FindY

import android.content.ClipData.Item
import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.layout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.awaitAll

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()
        }
    }
}
@Composable
fun Login() {
    Column {
        Column(modifier = Modifier
            .padding(8.dp)) {
            Box (Modifier.size(300.dp))
            Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
                Text(
                    text ="FindY",
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 80.sp,
                    color = Color.Black,
                    modifier = Modifier.wrapContentSize(align = Alignment.TopCenter)
                )
            }
            Spacer(modifier = Modifier.size(80.dp))
            Text(
                text = "Username/Password",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 20.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.size(8.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.extraSmall,
                colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colorScheme.onBackground)
            ){
                Row {
                    Text(
                        "Username/Phonenumber",
                        textAlign = TextAlign.Left  // horizontal center of the text
                    )
                }
            }
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = "Password",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 20.sp,
                color = Color.Black
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.extraSmall,
                colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colorScheme.onSurface)
            ){
                Row {
                    Text(
                        "Password"            )}
            }
        }

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .wrapContentSize(align = Alignment.BottomCenter)) {

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.extraSmall,
                colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colorScheme.onSurface
                )
            ) {
                Text(text = "Sign In")
            }
            Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
                Text(text = "Forgot Password?",
                    modifier = Modifier.wrapContentSize(align = Alignment.Center),
                    color = Color.DarkGray
                )
            }
        }
    }
}
@Composable
fun ProfileCard() {
    Card(
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(Color.Gray),
        border = BorderStroke(1.dp, color = Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
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
fun FriendsScreen(){
    Surface(color = Color.Gray,
        modifier = Modifier.verticalScroll(rememberScrollState())) {
        }

Box(Modifier.padding(top = 6.dp, start = 6.dp, end = 6.dp)){
    LazyColumn(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(6.dp))
    {
        items(16){ProfileCard()
        }
    }
    Icon(Icons.Rounded.MoreVert, null,
        Modifier
        .size(35.dp)
        .align(Alignment.TopEnd))
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    FriendsScreen()
    //ProfileCard()
    //Login()
}
