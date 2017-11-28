package com.alimmit.reactivedemo.service

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface MongoCrudService<T> {

    fun insert(t : T) : T

    fun read(id : String) : T

    fun update(t : T) : T

    fun delete(id : String)

    fun page(pageable : Pageable) : Page<T>
}