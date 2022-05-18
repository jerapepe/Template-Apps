package com.example.keycabinnet.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.keycabinnet.R
import com.example.keycabinnet.navigation.AppScreeens


@Composable
fun LoginScreen(navController: NavController){
    Scaffold {
        ShowScrensLogisn(navController)
    }
}


@Composable
fun ShowScrensLogisn(navController: NavController){
    Image(
        painter = painterResource(id = R.drawable.freedom),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp)
    )
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        var text by rememberSaveable { mutableStateOf("") }
        var textpass by rememberSaveable { mutableStateOf("") }

        OutlinedTextField(
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = "emailIcon") },
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text(text = "Email address") },
            placeholder = { Text(text = "Enter your e-mail") },
            modifier = Modifier.padding(15.dp)
        )

        OutlinedTextField(
            leadingIcon = { Icon(Icons.Rounded.Lock, contentDescription = "passIcon") },
            value = textpass,
            onValueChange = {
                textpass = it
            },
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Enter your password") },
            modifier = Modifier.padding(15.dp)
        )

        Button(onClick = { /*TODO*/
                         navController.navigate(route = AppScreeens.SecondScreen.route)
        },
            modifier = Modifier.padding(5.dp)
        ) {
            Text(text = "Iniciar sesion")
        }
        Button(onClick = { /*TODO*/
        },
            modifier = Modifier.padding(5.dp)
        ) {
            Text(text = "Crear cuenta")
        }
    }
}