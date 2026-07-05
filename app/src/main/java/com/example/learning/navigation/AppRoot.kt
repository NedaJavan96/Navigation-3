package com.example.learning.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import com.example.learning.ui.DetailScreen
import com.example.learning.ui.HomeScreen

@Composable
fun AppRoot(nav: AppNavGraph) {
    NavDisplay(
        backStack = nav.backStack,
        entryProvider = { route ->

            when (route) {

                is HomeRoute -> NavEntry(route) {
                    HomeScreen(
                        onGoDetail = { id ->
                            nav.navigate(DetailRoute(id))
                        }
                    )
                }

                is DetailRoute -> NavEntry(route) {
                    DetailScreen(
                        id = route.id,
                        onBack = { nav.pop() }
                    )
                }

                else -> NavEntry(route) {
                    HomeScreen(
                        onGoDetail = { id ->
                            nav.navigate(DetailRoute(id))
                        }
                    )
                }
            }
        }
    )
}