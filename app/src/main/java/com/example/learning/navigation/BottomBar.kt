package com.example.learning.navigation

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomBar(
    navigator: AppNavigator
) {
    val current = navigator.backStack.last()

    NavigationBar {

        NavigationBarItem(
            selected = current is Home1,
            onClick = {
                navigator.navigateToRoot(Home1)
            },
            icon = { Icon(Icons.Default.Home, null) },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = current is Settings,
            onClick = {
                navigator.navigateToRoot(Settings)
            },
            icon = { Icon(Icons.Default.Settings, null) },
            label = { Text("Settings") }
        )
    }
}