package br.com.roberto.algorithm.bigO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BigOSampleOne004Test {

    private lateinit var bigOSampleOne004: BigOSampleOne004

    @BeforeEach
    fun setup(){
        bigOSampleOne004 = BigOSampleOne004()
    }

    @Test
    @DisplayName("should return the common list values between numbersA and numbersB")
    fun `should print the target value`(){
        val numbersA = mutableListOf(10,8,6,4,2,1,3,5,7,9)
        val numbersB = mutableListOf(11,13,15,17,7,9)
        val listC = bigOSampleOne004.findCommonElements(numbersA,numbersB)
        Assertions.assertEquals (2, listC.size)
    }


}