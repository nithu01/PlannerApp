package com.app.plannerapp.database

import androidx.room.Insert
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.disposables.CompositeDisposable

interface CartDAO {

    @Insert
    fun insertdata(expenses: Expenses)

}