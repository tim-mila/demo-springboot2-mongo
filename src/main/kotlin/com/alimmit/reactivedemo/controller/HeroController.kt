package com.alimmit.reactivedemo.controller

import com.alimmit.reactivedemo.entity.Hero
import com.alimmit.reactivedemo.service.AbstractMongoCrudService
import com.alimmit.reactivedemo.service.HeroService
import com.alimmit.reactivedemo.service.HeroServiceImpl
import com.alimmit.reactivedemo.service.MongoCrudService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hero")
class HeroController(val heroService: HeroService) : AbstractMongoRestController<Hero>() {

    override fun service(): MongoCrudService<Hero> = heroService
}