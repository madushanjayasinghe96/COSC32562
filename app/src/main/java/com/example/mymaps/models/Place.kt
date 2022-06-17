package com.example.mymaps.models

import android.accounts.AuthenticatorDescription
import android.content.res.AssetFileDescriptor
import java.io.Serializable

data class Place(val title: String, val description: String,val latitude: Double, val longitude: Double) : Serializable {
}