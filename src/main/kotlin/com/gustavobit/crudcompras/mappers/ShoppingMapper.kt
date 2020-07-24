package com.gustavobit.crudcompras.mappers

import com.gustavobit.crudcompras.dto.ShoppingDTO
import com.gustavobit.crudcompras.model.Shopping

fun ShoppingDTO.toModel() = Shopping(
        id = id,
        nome = nome,
        quantidade = quantidade,
        marca = marca,
        validade = validade
)

fun Shopping.toDto() = ShoppingDTO(
        id = id,
        nome = nome,
        quantidade = quantidade,
        marca = marca,
        validade = validade
)