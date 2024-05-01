package com.example.bdroom.config

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.bdroom.dao.EmpresaLavadoDao
import com.example.bdroom.models.Clientes
import com.example.bdroom.models.RegistrosLavado
import com.example.bdroom.models.Servicios
import com.example.bdroom.models.Vehiculos

//Clase que no se puede instanciar
@Database(
    entities = [
        Clientes::class,
        RegistrosLavado::class,
        Servicios::class,
        Vehiculos::class
               ],
    version = 1
)
abstract class EmpresaLavadoDB: RoomDatabase() {

    abstract val empresaLavadoDao: EmpresaLavadoDao

    companion object{
        const val DATABASE_NAME = "db_empresaLavado"
    }
}