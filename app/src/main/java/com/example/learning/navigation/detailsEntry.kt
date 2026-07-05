package com.example.learning.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.learning.ui.DetailsScreen

fun EntryProviderScope<NavKey>.detailsEntry(
    navigator: AppNavigator
) {
    entry<Details> { route ->
        DetailsScreen(
            id = route.id,
            onBack = navigator::pop
        )
    }
}