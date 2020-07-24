package com.gustavobit.crudcompras.repositories

import com.gustavobit.crudcompras.model.Shopping
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ShoppingRepository : MongoRepository<Shopping, String> {

    fun findByName(name: String): Shopping?

}