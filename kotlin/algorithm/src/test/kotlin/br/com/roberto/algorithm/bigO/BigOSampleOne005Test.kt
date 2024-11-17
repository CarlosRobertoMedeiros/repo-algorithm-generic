package br.com.roberto.algorithm.bigO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BigOSampleOne005Test {

    private lateinit var bigOSampleOne005: BigOSampleOne005

    @BeforeEach
    fun setup(){
        bigOSampleOne005 = BigOSampleOne005()
    }

    @Test
    @DisplayName("should return correct fibonacciExponential")
    fun `should return correct fibonacciExponential`(){
        val number = 10
        val returnValue = bigOSampleOne005.fibonacciExponential(number)
        Assertions.assertEquals (55, returnValue)
    }
}