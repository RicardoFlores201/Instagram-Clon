package com.ejercicio.instagramclon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ejercicio.instagramclon.ui.theme.InstagramClonTheme
import com.ejercicio.instagramclon.view.core.navigation.NavigationWrapper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramClonTheme {
                NavigationWrapper()
            }
        }
    }
}

