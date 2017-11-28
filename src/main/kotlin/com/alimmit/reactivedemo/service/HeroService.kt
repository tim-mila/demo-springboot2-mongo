package com.alimmit.reactivedemo.service

import com.alimmit.reactivedemo.entity.Hero
import com.alimmit.reactivedemo.repository.HeroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Service

@Service
class HeroService : AbstractMongoCrudService<Hero>() {

    @Autowired
    private lateinit var heroRepository : HeroRepository;

    override fun repository(): MongoRepository<Hero, String> = heroRepository
}