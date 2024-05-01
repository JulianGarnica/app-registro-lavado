package com.example.bdroom.models

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Clientes (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ClienteID")
    var ClienteId: Long = 0,

    @ColumnInfo(name = "Nombre")
    @NonNull
    var Nombre: String = "",

    @ColumnInfo(name = "Apellido")
    @NonNull
    var Apellido: String = "",

    @ColumnInfo(name = "Telefono")
    @NonNull
    var Telefono: String = "",

    @ColumnInfo(name = "Email")
    @NonNull
    var Email: String = "",

    @ColumnInfo(name = "Direccion")
    @NonNull
    var Direccion: String = ""

)