package com.example.mymaps.models

import java.io.Serializable

data class UserMaps(val title: String, val places: List<Place>) : Serializable{
}