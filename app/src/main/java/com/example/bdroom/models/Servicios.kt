package com.example.bdroom.models

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Servicios (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ServicioID")
    var ServicioID: Long = 0,

    @ColumnInfo(name = "Nombre")
    @NonNull
    var Nombre: String = "",

    @ColumnInfo(name = "Precio")
    @NonNull
    var Precio: Double = 0.0

    )