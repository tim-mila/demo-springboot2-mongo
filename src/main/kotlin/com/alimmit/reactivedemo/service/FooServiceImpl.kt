package com.alimmit.reactivedemo.service

import com.alimmit.reactivedemo.entity.Foo
import com.alimmit.reactivedemo.repository.FooRepository
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Service

@Service
class FooServiceImpl(private val fooRepository: FooRepository) : AbstractMongoCrudService<Foo>(), FooService {

    override fun repository(): MongoRepository<Foo, String> = fooRepository
}