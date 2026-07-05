package com.example.learning.navigation

import androidx.navigation3.runtime.NavKey

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.rememberNavBackStack

import androidx.navigation3.runtime.NavBackStack

class AppNavigator(
    val backStack: NavBackStack<NavKey>
) {

    fun navigate(route: NavKey) {
        backStack.add(route)
    }

    fun pop() {
        if (backStack.size > 1) {
            backStack.removeAt(backStack.lastIndex)
        }
    }
}

@Composable
fun rememberAppNavigator(): AppNavigator {

    val backStack = rememberNavBackStack(Home)

    return remember(backStack) {
        AppNavigator(backStack)
    }
}