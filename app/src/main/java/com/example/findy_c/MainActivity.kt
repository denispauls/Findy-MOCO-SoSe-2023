package com.example.FindY

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                onClick = { /*TODO*/ },
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

@Preview(showBackground = true)
@Composable
fun Preview(){

    Login()
}
