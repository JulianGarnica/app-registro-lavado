package com.example.bdroom.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.TypeConverters
import androidx.room.Update
import com.example.bdroom.models.*

@Dao
@TypeConverters(DateConverter::class)
interface EmpresaLavadoDao {

    //Get All
    @Query("SELECT * FROM Clientes")
    fun getAllClientes(): List<Clientes>
    @Query("SELECT * FROM RegistrosLavado INNER JOIN Vehiculos ON Vehiculos.VehiculoID = RegistrosLavado.VehiculoID INNER JOIN Servicios ON Servicios.ServicioID = RegistrosLavado.ServicioID")
    fun getAllRegistrosLavado(): List<RegistrosLavado>
    @Query("SELECT * FROM Servicios")
    fun getAllServicios(): List<Servicios>
    @Query("SELECT * FROM Vehiculos INNER JOIN Clientes ON Clientes.ClienteID = Vehiculos.ClienteID")
    fun getAllVehiculos(): List<Vehiculos>


    //Get by ID
    @Query("SELECT * FROM Clientes WHERE :id")
    fun getByIdClientes(id: Long): Clientes
    @Query("SELECT * FROM RegistrosLavado INNER JOIN Vehiculos ON Vehiculos.VehiculoID = RegistrosLavado.VehiculoID INNER JOIN Servicios ON Servicios.ServicioID = RegistrosLavado.ServicioID WHERE :id")
    fun getByIdRegistrosLavado(id: Long): RegistrosLavado
    @Query("SELECT * FROM Servicios WHERE :id")
    fun getByIdServicios(id: Long): Servicios
    @Query("SELECT * FROM Vehiculos INNER JOIN Clientes ON Clientes.ClienteID = Vehiculos.ClienteID WHERE :id")
    fun getByIdVehiculos(id: Long): Vehiculos

    //All inserts
    @Insert
    fun insert(perso: Clientes)
    @Insert
    fun insert(perso: RegistrosLavado)
    @Insert
    fun insert(perso: Servicios)
    @Insert
    fun insert(perso: Vehiculos)

    //All updates
    @Update
    fun update(perso: Clientes)
    @Update
    fun update(perso: RegistrosLavado)
    @Update
    fun update(perso: Servicios)
    @Update
    fun update(perso: Vehiculos)

    //All deletes
    @Delete
    fun delete(perso: Clientes)
    @Delete
    fun delete(perso: RegistrosLavado)
    @Delete
    fun delete(perso: Servicios)
    @Delete
    fun delete(perso: Vehiculos)
}