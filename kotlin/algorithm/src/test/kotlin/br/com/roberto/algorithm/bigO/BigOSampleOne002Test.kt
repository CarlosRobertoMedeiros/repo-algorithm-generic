package br.com.roberto.algorithm.bigO

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class BigOSampleOne002Test {

    private lateinit var bigOSampleOne002: BigOSampleOne002

    @BeforeEach
    fun setup(){
        bigOSampleOne002 = BigOSampleOne002()
    }

    @Test
    @DisplayName("should print the items")
    fun `should print the items`(){
        val outputStrem = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStrem))

        val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
        bigOSampleOne002.printItens(numbers)

        Assertions.assertEquals("12345678910", outputStrem.toString().trim())
        System.setOut(System.out)
    }

    @Test
    @DisplayName("should return max value")
    fun `should return max value`(){
        val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
        val max = bigOSampleOne002.findMax(numbers)
        Assertions.assertEquals(10, max)
    }

    @Test
    @DisplayName("should garantee max value")
    fun `should garantee max value`(){
        val numbers = arrayOf(1,2,3,10,4,5)
        val max = bigOSampleOne002.findMax(numbers)
        Assertions.assertEquals(10, max)
    }



    @Test
    @DisplayName("should correct the sum values")
    fun `should correct the sum values`(){
        val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)
        val sumValues =  bigOSampleOne002.findSum(numbers)
        Assertions.assertEquals(55,sumValues)
    }
}