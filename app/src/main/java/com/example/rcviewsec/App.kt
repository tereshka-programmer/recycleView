package com.example.rcviewsec

import android.app.Application
import com.example.rcviewsec.model.UsersService

class App : Application() {
    val usersService = UsersService()
}