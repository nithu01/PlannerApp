package com.app.plannerapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Expenses")
class Expenses {

    @PrimaryKey(autoGenerate = true)
    var id : String ?=null

    @ColumnInfo(name = "expenses")
    var expenses : String?=null

    @ColumnInfo(name = "amount")
    var amount : String ? = null

    @ColumnInfo(name = "date")
    var date : String ? =null

}