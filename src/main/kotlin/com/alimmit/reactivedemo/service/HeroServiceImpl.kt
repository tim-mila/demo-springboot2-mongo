package com.alimmit.reactivedemo.service

import com.alimmit.reactivedemo.entity.Hero
import com.alimmit.reactivedemo.repository.HeroRepository
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Service

@Service
class HeroServiceImpl(val heroRepository: HeroRepository) : AbstractMongoCrudService<Hero>(), HeroService {

    override fun repository(): MongoRepository<Hero, String> = heroRepository
}