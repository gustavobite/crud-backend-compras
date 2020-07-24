package com.gustavobit.crudcompras.dto

data class ShoppingDTO(
        val id: String?,
        val nome: String,
        val quantidade: Int,
        val marca: String,
        val validade: String
)