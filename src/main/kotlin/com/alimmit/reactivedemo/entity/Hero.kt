package com.alimmit.reactivedemo.entity

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Hero {

    @Id lateinit var id : String
    var name: String = ""

    constructor()
    constructor(name : String) {
        this.name = name
    }

    override fun toString(): String = "Hero(id='$id', name='$name')"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Hero

        if (id != other.id) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }
}