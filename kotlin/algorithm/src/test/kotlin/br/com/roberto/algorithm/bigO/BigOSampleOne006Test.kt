package br.com.roberto.algorithm.bigO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BigOSampleOne006Test {

    private lateinit var bigOSampleOne006: BigOSampleOne006

    @BeforeEach
    fun setup(){
        bigOSampleOne006 = BigOSampleOne006()
    }

    @Test
    @DisplayName("should return correct fatorial value")
    fun `should return correct fatorial value`(){
        val number = 5
        val returnValue = bigOSampleOne006.factorial(number)
        Assertions.assertEquals (120, returnValue)
    }
}