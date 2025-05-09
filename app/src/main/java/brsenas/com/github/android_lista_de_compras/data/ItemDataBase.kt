package brsenas.com.github.android_lista_de_compras.data

import androidx.room.Database
import androidx.room.RoomDatabase
import carreiras.com.github.listadecompras.model.ItemModel


@DataBase(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDataBase() {

    abstract fun itemDao(): ItemDao
}