package com.example.rcviewsec.model

import android.provider.ContactsContract

data class User(
    val id: Long,
    val photo: String,
    val name: String,
    val company: String
)