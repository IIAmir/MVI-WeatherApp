package com.example.weatherapp.data.mappers

import com.example.weatherapp.domain.weather.WeatherData

data class IndexWeatherData(
    val index: Int,
    val data: WeatherData,
)
