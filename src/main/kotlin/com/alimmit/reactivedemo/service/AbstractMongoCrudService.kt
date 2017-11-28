package com.alimmit.reactivedemo.service

import com.alimmit.reactivedemo.controller.exception.NotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

abstract class AbstractMongoCrudService<T> : MongoCrudService<T> {

    protected abstract fun repository() : MongoRepository<T, String>

    override fun insert(t : T) : T = repository().insert(t)

    override fun read(id : String) : T = repository().findById(id).orElseThrow { throw NotFoundException() }

    override fun update(t : T) : T = repository().save(t)

    override fun delete(id : String) = repository().deleteById(id)

    override fun page(pageable : Pageable) : Page<T> = repository().findAll(pageable)
}