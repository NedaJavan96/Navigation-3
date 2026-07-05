package com.example.learning.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface AppRoute : NavKey

@kotlinx.serialization.Serializable
data object Home : AppRoute

@Serializable
data class Details(
    val id: Int
) : AppRoute