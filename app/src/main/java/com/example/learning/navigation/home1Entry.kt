package com.example.learning.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.learning.ui.HomeScreen

fun EntryProviderScope<NavKey>.home1Entry(
    navigator: AppNavigator
) {
    entry<Home1> {
        HomeScreen(
            onOpenDetails = {
                navigator.navigate(Details(it))
            }
        )
    }
}