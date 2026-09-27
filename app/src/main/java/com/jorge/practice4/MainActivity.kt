package com.jorge.practice4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.jorge.practice4.navigation.NavigationHost
import com.jorge.practice4.ui.theme.Practice4Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            Practice4Theme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavigationHost(
                        modifier = Modifier.padding(innerPadding),
                        navController = navController
                    )

                }

            }

        }

    }

}