package com.example.learning.navigation

import androidx.compose.ui.text.font.FontVariation
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.learning.ui.HomeScreen

fun EntryProviderScope<NavKey>.settingEntry(
    navigator: AppNavigator
) {
    entry<Settings> {
        HomeScreen(
            onOpenDetails = {
                navigator.navigate(Details(it))
            }
        )
    }
}