package com.alimmit.reactivedemo.controller

import com.alimmit.reactivedemo.entity.Foo
import com.alimmit.reactivedemo.service.FooService
import com.alimmit.reactivedemo.service.MongoCrudService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/foo")
class FooController(val fooService: FooService) : AbstractMongoRestController<Foo>() {

    override fun service(): MongoCrudService<Foo> = fooService
}