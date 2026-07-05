package com.example.learning.navigation

import androidx.compose.runtime.mutableStateListOf

class AppNavGraph {
    val backStack = mutableStateListOf<Any>(HomeRoute)

    fun navigate(route: Any) {
        backStack.add(route)
    }

    fun pop() {
        if (backStack.size > 1) {
            backStack.removeAt(backStack.lastIndex)
        }
    }
}