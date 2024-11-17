package br.com.roberto.algorithm.bigO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BigOSampleOne003Test {

    private lateinit var bigOSampleOne003: BigOSampleOne003

    @BeforeEach
    fun setup(){
        bigOSampleOne003 = BigOSampleOne003()
    }

    @Test
    @DisplayName("should return the position where find the target value")
    fun `should print the target value`(){
        val numbers = intArrayOf(10,8,6,4,2,1,3,5,7,9)
        val target = 7
        val returnValue = bigOSampleOne003.binarySearchNumber(numbers, target)

        Assertions.assertEquals(6, returnValue)
    }

    @Test
    @DisplayName("should return -1 when not foud the target value")
    fun `should return -1 when not foud the target value`(){
        val numbers = intArrayOf(10,8,6,4,2,1,3,5,7,9)
        val target = 11
        val returnValue = bigOSampleOne003.binarySearchNumber(numbers, target)

        Assertions.assertEquals(-1, returnValue)
    }
}