package br.com.roberto.algorithm.bigO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class BigOSampleOne001Test {

    private lateinit var bigOSampleOne: BigOSampleOne001

    @BeforeEach
    fun setup(){
        bigOSampleOne = BigOSampleOne001()
    }

    @Test
    @DisplayName("should correct the sum values")
    fun `should correct the sum values`(){
        val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
        val sumValues =  bigOSampleOne.findSum(numbers)
        Assertions.assertEquals(55,sumValues)
    }
}