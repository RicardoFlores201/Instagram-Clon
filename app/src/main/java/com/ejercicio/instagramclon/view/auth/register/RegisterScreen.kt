package com.ejercicio.instagramclon.view.auth.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun RegisterScreen(){
    val cellphone = " "
    Scaffold{ paddingValues ->
        Column(
            modifier = Modifier.background(Color.White)
                .padding(paddingValues)
                .padding(horizontal = 15.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start
        ) {
            Text("¿Cuál es tu número de móvil?", modifier = Modifier.padding(top = 20.dp))
            Text("Introduce tu número de móvil de contacto. Nadie lo verá en tu perfil")
            OutlinedTextField(
                value = cellphone,
                onValueChange = {  },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(25),
                label = { Text("Número de móvil") }
            )
            Text("Puede que recibsa notificaciones nuestras en WhatsApp y por SMS por motivos de seguridad y para iniciar sesión")
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                //enabled = uiState.isLoginEnabled
            ) {
                Text("Siguiente", modifier = Modifier.padding(vertical = 4.dp))
            }
            OutlinedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Registrarte con tu correo electrónico")
            }
            Spacer(Modifier.weight(1f))

            TextButton(onClick = {}) {
                Text("Buscar mi cuenta")
            }
        }
    }
}