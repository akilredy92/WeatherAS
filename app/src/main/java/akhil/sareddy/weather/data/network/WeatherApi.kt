package akhil.sareddy.weather.data.network

import akhil.sareddy.weather.BuildConfig
import akhil.sareddy.weather.data.model.ForecastResponse
import akhil.sareddy.weather.utils.DEFAULT_WEATHER_DESTINATION
import akhil.sareddy.weather.utils.NUMBER_OF_DAYS
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("forecast.json")
    suspend fun getWeatherForecast(
        @Query("key") key: String = BuildConfig.API_KEY,
        @Query("q") city: String = DEFAULT_WEATHER_DESTINATION,
        @Query("days") days: Int = NUMBER_OF_DAYS,
    ): ForecastResponse
}