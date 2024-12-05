package br.com.roberto.algorithm.datastructure

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ArraySample001Test {

    private lateinit var arraySample001: ArraySample001

    @BeforeEach
    fun setup(){
        arraySample001 = ArraySample001()
    }

    @Test
    @DisplayName("should print the array values")
    fun `should print the message`(){
        val result =  arraySample001.arrayOfAny()
        assertEquals(1, result.size, "O tamanho do array não é o esperado")
    }
}