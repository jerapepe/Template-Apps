package com.example.keycabinnet.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.keycabinnet.navigation.AppScreeens
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun FirstScreen(navController: NavController){
    Scaffold {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Image(
                    painter = painterResource(id = com.example.keycabinnet.R.drawable.back),
                    contentDescription = null
                )
                Text("Bienvenido a Key Cabinet")
                Text("El lugar más seguro y ordenado para ti.")
            }
        }
        Button(onClick = { /*TODO*/
            navController.navigate(route = AppScreeens.LoginScreen.route)
        },
            modifier = Modifier.padding(5.dp)) {
            Text(text = "Iniciar")
        }}
}

@Preview(showBackground = true)
@Composable
fun ShowScrens(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Image(
                    painter = painterResource(id = com.example.keycabinnet.R.drawable.back),
                    contentDescription = null
                )
                Text("Bienvenido a Key Cabinet")
                Text("El lugar más seguro y ordenado para ti.")
            }
        }
        Button(onClick = { /*TODO*/
        },
            modifier = Modifier.padding(5.dp)) {
            Text(text = "Iniciar")
        }}
}

@Preview(showBackground = true)
@Composable
fun ShowScrensLogin(){
    Image(
        painter = painterResource(id = com.example.keycabinnet.R.drawable.freedom),
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
            placeholder = { Text(text = "Enter your e-mail") },
            modifier = Modifier.padding(15.dp)
        )

        Button(onClick = { /*TODO*/
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
