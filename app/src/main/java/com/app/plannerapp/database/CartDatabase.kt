package com.app.plannerapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Expenses::class] ,version = 1)
public abstract class CartDatabase: RoomDatabase() {
   public var cartDAO : CartDAO ? = null

    companion object{
        @Volatile
        var cartDatabase : CartDatabase ? = null
        open fun getCartDatabase(context: Context): CartDatabase? {
            if (cartDatabase == null) {
                cartDatabase = Room.databaseBuilder(
                    context.applicationContext,
                    CartDatabase::class.java, "Cart_Database"
                ).build()
            }
            return cartDatabase
        }
    }


}