package com.alimmit.reactivedemo.controller

import com.alimmit.reactivedemo.service.MongoCrudService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

abstract class AbstractMongoRestController<T> {

    protected abstract fun service() : MongoCrudService<T>

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun page(@PageableDefault(page = 0, size = 10) pageable : Pageable) : Page<T> = service().page(pageable)

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = arrayOf(RequestMethod.POST))
    fun create(@RequestBody t: T) : T = service().insert(t)

    @RequestMapping("/{id}", method = arrayOf(RequestMethod.GET))
    fun read(@PathVariable id: String) : T = service().read(id)

    @RequestMapping("/{id}", method = arrayOf(RequestMethod.PUT))
    fun update(@RequestBody t: T) : T = service().update(t)

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping("/{id}", method = arrayOf(RequestMethod.DELETE))
    fun delete(@PathVariable id: String) = service().delete(id)
}