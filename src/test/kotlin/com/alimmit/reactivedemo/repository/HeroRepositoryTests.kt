package com.alimmit.reactivedemo.repository

import com.alimmit.reactivedemo.ReactiveDemoApplicationTests
import com.alimmit.reactivedemo.entity.Hero
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired

class HeroRepositoryTests : ReactiveDemoApplicationTests() {

    @Autowired
    lateinit var heroRepository : HeroRepository

    @Test
    fun assertFindByName() {
        val original : Hero = heroRepository.save(Hero("Test"))
        val actual = heroRepository.findByName("Test")
        assert(original == actual[0])
        actual.forEach { hero -> heroRepository.delete(hero) }
    }
}