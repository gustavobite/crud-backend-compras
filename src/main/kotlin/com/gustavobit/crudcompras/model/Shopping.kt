package com.gustavobit.crudcompras.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Shopping(
        @Id
        val id: String? = null,
        val nome: String,
        val quantidade: Int,
        val marca: String,
        val validade: String
)