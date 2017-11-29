package com.alimmit.reactivedemo.repository

import com.alimmit.reactivedemo.entity.Foo
import org.springframework.data.mongodb.repository.MongoRepository

interface FooRepository : MongoRepository<Foo, String> {

    fun findByName(name: String) : List<Foo>
}