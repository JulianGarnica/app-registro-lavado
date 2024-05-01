package com.example.bdroom.models

import androidx.annotation.NonNull
import androidx.room.*
import java.security.Timestamp
import java.time.LocalDateTime
import java.util.Date

@Entity(foreignKeys = [
    ForeignKey(entity = Vehiculos::class, parentColumns = ["VehiculoID"], childColumns = ["VehiculoID"], onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE),
    ForeignKey(entity = Servicios::class, parentColumns = ["ServicioID"], childColumns = ["ServicioID"], onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)
])
data class RegistrosLavado(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "RegistroID")
    var RegistroID: Long = 0,

    @ColumnInfo(name = "VehiculoID")
    @NonNull
    var VehiculoID: Long = 0,

    @ColumnInfo(name = "ServicioID")
    @NonNull
    var ServicioID: Long = 0,

    @ColumnInfo(name = "FechaLavado")
    @NonNull
    var FechaLavado: String = String(),

    @ColumnInfo(name = "PrecioTotal")
    @NonNull
    var PrecioTotal: Double = 0.0
)
