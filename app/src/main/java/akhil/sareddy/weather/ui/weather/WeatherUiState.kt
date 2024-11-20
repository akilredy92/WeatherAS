package akhil.sareddy.weather.ui.weather

import akhil.sareddy.weather.model.Weather

data class WeatherUiState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = "",
)
