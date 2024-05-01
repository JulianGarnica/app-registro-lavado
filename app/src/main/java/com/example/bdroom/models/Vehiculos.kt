package com.example.bdroom.models

import androidx.annotation.NonNull
import androidx.room.*

@Entity(foreignKeys = [
    ForeignKey(entity = Clientes::class, parentColumns = ["ClienteID"], childColumns = ["ClienteID"], onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)
])
data class Vehiculos(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "VehiculoID")
    var VehiculoID: Long = 0,

    @ColumnInfo(name = "ClienteID")
    @NonNull
    var ClienteID: Long = 0,

    @ColumnInfo(name = "Marca")
    @NonNull
    var Marca: String = "",

    @ColumnInfo(name = "Modelo")
    @NonNull
    var Modelo: String = "",

    @ColumnInfo(name = "Placa")
    @NonNull
    var Placa: String = "",

    @ColumnInfo(name = "Color")
    @NonNull
    var Color: String = "",

    @ColumnInfo(name = "Tipo")
    @NonNull
    var Tipo: String = "",
)
