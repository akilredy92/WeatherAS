package akhil.sareddy.weather.data.repository

import akhil.sareddy.weather.model.Weather
import akhil.sareddy.weather.utils.Result
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherForecast(city: String): Flow<Result<Weather>>
}