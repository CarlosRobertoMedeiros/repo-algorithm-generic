package br.com.roberto.algorithm.bigOgrokkingalgorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Exercise3SelectionSortTest{

    private lateinit var exercise3SelectionSort: Exercise3SelectionSort

    @BeforeEach
    fun setup() {
        exercise3SelectionSort = Exercise3SelectionSort()
    }

    @Test
    @DisplayName("should return the array using selection sorted")
    fun `should return the array using selection sorted`() {
       val myArray = intArrayOf(64,25,12,22,11)
       val arrayReturn = exercise3SelectionSort.selectionSort(myArray)
        assertEquals(11, arrayReturn[0])
        assertEquals(12, arrayReturn[1])
        assertEquals(22, arrayReturn[2])
        assertEquals(25, arrayReturn[3])
        assertEquals(64, arrayReturn[4])
    }
}