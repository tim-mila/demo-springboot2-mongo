package com.alimmit.reactivedemo.controller

import com.alimmit.reactivedemo.entity.Hero
import com.alimmit.reactivedemo.service.AbstractMongoCrudService
import com.alimmit.reactivedemo.service.HeroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hero")
class HeroController : AbstractMongoRestController<Hero>() {

    @Autowired
    private lateinit var heroService : HeroService

    override fun service(): AbstractMongoCrudService<Hero> = heroService
}