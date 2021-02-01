package com.app.plannerapp.database

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class CartViewModel(application: Application) : ViewModel() {
    var cartDAO : CartDAO ? = null
    @Volatile
    var cartDatabase : CartDatabase ? =null
//    var alllcartitems : LiveData<List<Expenses>>

    init {
        cartDatabase = CartDatabase.getCartDatabase(application)
        cartDAO = cartDatabase!!.cartDAO

    }


}