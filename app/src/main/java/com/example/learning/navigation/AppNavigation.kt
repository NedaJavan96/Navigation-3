package com.example.learning.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay

@Composable
fun AppNavigation() {

    val navigator = rememberAppNavigator()

    Scaffold(
        bottomBar = {
            BottomBar(navigator)
        }
    ) { padding ->

        Box(
            modifier = Modifier.padding(padding)
        ) {
            NavDisplay(
                backStack = navigator.backStack,
                onBack = navigator::pop,
                entryDecorators = listOf(
                    rememberSaveableStateHolderNavEntryDecorator(),
                    rememberViewModelStoreNavEntryDecorator()
                ),
                entryProvider = entryProvider {
                    homeEntry(navigator)
                    home1Entry(navigator)
                    settingEntry(navigator)
                    detailsEntry(navigator)
                }
            )
        }
    }
}