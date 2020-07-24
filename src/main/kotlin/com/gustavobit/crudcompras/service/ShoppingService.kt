package com.gustavobit.crudcompras.service

import com.gustavobit.crudcompras.model.Shopping

interface ShoppingService {

    fun persist(shopping: Shopping): Shopping

    fun findById(id: String): Shopping?

    fun getAll(): List<Shopping>

    fun deleteById(id: String)

}