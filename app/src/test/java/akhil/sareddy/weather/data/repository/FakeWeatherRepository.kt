package akhil.sareddy.weather.data.repository

import akhil.sareddy.weather.data.model.ForecastResponse.Current.Condition
import akhil.sareddy.weather.model.Forecast
import akhil.sareddy.weather.model.Hour
import akhil.sareddy.weather.model.Weather
import akhil.sareddy.weather.utils.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object FakeWeatherRepository : WeatherRepository {
    override fun getWeatherForecast(city: String): Flow<Result<Weather>> {
        return flow {
            emit(Result.Loading)
            emit(Result.Success(fakeWeather))
        }
    }
}

val fakeWeather = Weather(
    temperature = 20,
    date = "2023-10-15",
    wind = 10,
    humidity = 60,
    feelsLike = 25,
    condition = Condition(200, "sunny-icon", "Sunny"),
    uv = 5,
    name = "San Francisco",
    forecasts = listOf(
        Forecast(
            date = "2023-10-15",
            maxTemp = "25",
            minTemp = "15",
            sunrise = "06:30 AM",
            sunset = "06:30 PM",
            icon = "sunny-icon",
            hour = listOf(
                Hour("08:00 AM", "sunny-icon", "Sunny"),
                Hour("09:00 AM", "sunny-icon", "Sunny"),
                Hour("10:00 AM", "sunny-icon", "Sunny")
            )
        )
    )
)
