package br.com.roberto.algorithm.bigO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class BigOSampleOne002Test {

    private lateinit var bigOSampleOne002: BigOSampleOne002

    @BeforeEach
    fun setup(){
        bigOSampleOne002 =  BigOSampleOne002()
    }

    @Test
    @DisplayName("should print the hello world message")
    fun `should print the message`(){
        val message =  bigOSampleOne002.printMessage("Hello World")
        Assertions.assertEquals("Hello World",message)
    }

    @Test
    @DisplayName("should return the values informed")
    fun `should return the values informed`(){
        val value =  bigOSampleOne002.returnValue(10)
        Assertions.assertEquals(10,value)
    }

    @Test
    @DisplayName("should return the first position")
    fun `should correct the sum values`(){
        val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
        val firstPositionValue =  bigOSampleOne002.returnArrayPosition(numbers)
        Assertions.assertEquals(1,firstPositionValue)
    }
}