package com.example.findy_c.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import com.example.findy_c.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(
    navController: NavController
) {
    Column {
        var text by remember { mutableStateOf(TextFieldValue("")) }
        var pass by remember { mutableStateOf(TextFieldValue("")) }
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

            val focusManager = LocalFocusManager.current

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                placeholder = { Text(text = "Username/Phone number") },
                shape = MaterialTheme.shapes.extraSmall,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.moveFocus(FocusDirection.Down)
                    }
                ),
                maxLines = 1
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = "Password",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 20.sp,
                color = Color.Black
            )
            OutlinedTextField(
                value = pass,
                onValueChange = {
                    pass = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                placeholder = { Text(text = "Password") },
                visualTransformation = PasswordVisualTransformation(mask = 0x2022.toChar()),
                shape = MaterialTheme.shapes.extraSmall,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.clearFocus()
                    }
                ),
                maxLines = 1,
            )
        }
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .wrapContentSize(align = Alignment.BottomCenter)) {

        Button(
            onClick = { navController.navigate(route = Screens.Friends.route)},
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
@Composable
@Preview(showBackground = true)
fun LoginScreen(){
    Login (
        navController = rememberNavController()
    )
}