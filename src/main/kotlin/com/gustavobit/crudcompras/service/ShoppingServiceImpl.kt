package com.gustavobit.crudcompras.service

import com.gustavobit.crudcompras.model.Shopping
import com.gustavobit.crudcompras.repositories.ShoppingRepository
import org.springframework.stereotype.Service

@Service
class ShoppingServiceImpl(private val repository: ShoppingRepository) : ShoppingService {

    override fun persist(shopping: Shopping): Shopping {
        return repository.save(shopping)
    }

    override fun findById(id: String): Shopping? {
        return try {
            repository.findById(id).get()
        } catch (e: NoSuchElementException) {
            null
        }
    }

    override fun getAll(): List<Shopping> {
        return repository.findAll()
    }

    override fun deleteById(id: String) {
        return repository.deleteById(id)
    }

}