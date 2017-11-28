package com.alimmit.reactivedemo.service

import com.alimmit.reactivedemo.controller.exception.NotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

abstract class AbstractMongoCrudService<T> {

    protected abstract fun repository() : MongoRepository<T, String>

    fun insert(t : T) : T = repository().insert(t)

    fun read(id : String) : T = repository().findById(id).orElseThrow { throw NotFoundException() }

    fun update(t : T) : T = repository().save(t)

    fun delete(id : String) = repository().deleteById(id)

    fun page(pageable : Pageable) : Page<T> = repository().findAll(pageable)
}