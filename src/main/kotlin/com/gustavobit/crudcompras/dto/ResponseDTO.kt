package com.gustavobit.crudcompras.dto

data class ResponseDTO<T>(
        val data: T? = null,
        val errors: MutableList<String>? = null
)