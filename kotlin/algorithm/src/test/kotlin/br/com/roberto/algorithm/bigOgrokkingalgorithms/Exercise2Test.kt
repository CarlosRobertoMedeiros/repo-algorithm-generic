package br.com.roberto.algorithm.bigOgrokkingalgorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Exercise2Test {

    private lateinit var exercise2: Exercise2

    @BeforeEach
    fun setup() {
        exercise2 = Exercise2()
    }

    /**
     * Exemplo de aplicação do exercício 1
     */
    @Test
    @DisplayName("should return the position where find the target text with 128 names")
    fun `should test insert time execution between ArrayList(Array) and LinkedList(Lista Encadeada)`() {
        val timedInsertionArrayListExecuted = exercise2.timedArrayListInsertion()
        val timedInsertionLinkedListExecuted = exercise2.timedLinkedListInsertion()

        assertTrue(timedInsertionArrayListExecuted > timedInsertionLinkedListExecuted)
    }
}