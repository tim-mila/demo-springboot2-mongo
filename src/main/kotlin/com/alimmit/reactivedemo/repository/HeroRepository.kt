package com.alimmit.reactivedemo.repository

import com.alimmit.reactivedemo.entity.Hero
import org.springframework.data.mongodb.repository.MongoRepository

interface HeroRepository : MongoRepository<Hero, String> {

    fun findByName(name: String) : List<Hero>
}