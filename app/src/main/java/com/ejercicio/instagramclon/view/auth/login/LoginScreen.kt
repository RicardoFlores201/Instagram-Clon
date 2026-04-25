package com.ejercicio.instagramclon.view.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ejercicio.instagramclon.R

@Preview
@Composable
fun LoginScreen( loginViewModel: LoginViewModel = viewModel()) {

    val uiState by loginViewModel.uiState.collectAsStateWithLifecycle()
    val email = uiState.email
    val password = uiState.password

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(paddingValues)
                .padding(horizontal = 15.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Español (México)", modifier = Modifier.padding(top = 20.dp))

            Spacer(Modifier.weight(1f))

            Image(
                modifier = Modifier.size(60.dp),
                painter = painterResource(R.drawable.instagram_icon),
                contentDescription = "Instagram Logo"
            )

            Spacer(Modifier.weight(1f))

            OutlinedTextField(
                value = email,
                onValueChange = { loginViewModel.onEmailChanged(it) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(25),
                label = { Text("Usuario, correo electrónico o móvil") }
            )

            Spacer(Modifier.height(8.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { loginViewModel.onPasswordChanged(it) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(25),
                label = { Text("Contraseña") }
            )

            Spacer(Modifier.height(8.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text("Iniciar sesión", modifier = Modifier.padding(vertical = 4.dp))
            }

            TextButton(onClick = {}) {
                Text("¿Has olvidado la contraseña?")
            }

            Spacer(Modifier.weight(1.3f))

            OutlinedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Crear cuenta nueva")
            }

            Image(
                modifier = Modifier.width(70.dp).padding(bottom = 16.dp),
                painter = painterResource(R.drawable.meta_icon),
                contentDescription = "Logo Meta"
            )
        }
    }
}