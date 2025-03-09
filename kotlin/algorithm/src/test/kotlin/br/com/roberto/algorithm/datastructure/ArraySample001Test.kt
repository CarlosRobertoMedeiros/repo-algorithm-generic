package br.com.roberto.algorithm.datastructure

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

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
        assertEquals(8, result.size, "O tamanho do array não é o esperado")
    }

    @Test
    @DisplayName("should return the first position in the array")
    fun `should return the first position in the array`() {
        val result = arraySample001.arrayOfAny()
        val firstItem = result.firstOrNull()
        assertEquals(1, firstItem, "O valor do primeiro item do array é diferente do esperado")
    }

    @Test
    @DisplayName("should return the last position in the array")
    fun `should return the last position in the array`() {
        val result = arraySample001.arrayOfAny()
        val lastItem = result.lastOrNull()
        assertEquals(0.1, lastItem, "O valor do ultimo item do array é diferente do esperado")
    }

    @Test
    @DisplayName("should return parts inside of the array")
    fun `should return parts inside of the array`() {
        val result = arraySample001.arrayOfAny()
        val subArray = result.slice(2..4)
        val expected = listOf(3,4,"Teste")
        assertEquals(expected, subArray, "O valor do subarray é diferente do esperado")
    }

    @Test
    @DisplayName("should return error because the position in array doesnt exists")
    fun `should return error because the position in array doesnt exists`() {
        val result = arraySample001.arrayOfAny()
        val exception = assertThrows<ArrayIndexOutOfBoundsException> {
            result.get(20) //Posicao Nao existe
        }
        assertEquals("Index 20 out of bounds for length ${result.size}", exception.message)
    }

    @Test
    @DisplayName("should return len inside the array")
    fun `should return len inside the array`() {
        val result = arraySample001.arrayOfAny()
        assertEquals(8,result.size, "o valor do array não corresponde ao selecionado")
    }

    @Test
    @DisplayName("should ordered the array in the same type")
    fun `should ordered the array in the same type`() {
        val result = arraySample001.myMumbers()
        val sortedResult = result.sorted()
        val excepted = listOf(1,2,3,4,5)
        assertEquals(excepted,sortedResult,"o valor do array numerico não corresponde ao selecionado")
    }

    @Test
    @DisplayName("should inserted item inside array")
    fun `should inserted item inside array`() {
        //O Kotlin não suporta inserção dinâmica para arrays
        // my_array.insert(0,999) NÃO OCORRE PARA ARRAY
        // my_array.append(0,999) NÃO OCORRE PARA ARRAY
        //Nos momentos que isso ocorre, muito codigo fonte é alterado
        //Para mover todos os items do array em uma posição
        assertEquals(1,1)
    }

    @Test
    @DisplayName("should remove item inside array")
    fun `should remove item inside array`() {
        //O Kotlin não suporta remoção dinâmica para arrays
        // my_array.remove(0) NÃO OCORRE PARA ARRAY
        // my_array.remove(1) NÃO OCORRE PARA ARRAY
        //Nos momentos que isso ocorre, muito codigo fonte é alterado
        //Para mover todos os items do array em uma posição
        assertEquals(1,1)
    }

    @Test
    @DisplayName("should return the min value in array")
    fun `should return the min value in array`() {
        val result = arraySample001.myMumbers().min()
        assertEquals(result,1)
    }

    @Test
    @DisplayName("should return the max value in array")
    fun `should return the max value in array`() {
        val result = arraySample001.myMumbers().max()
        assertEquals(result,5)
    }

    @Test
    @DisplayName("should create a Array in 100 positions")
    fun `should create a Array in 100 positions`() {
        val myArray = (1..100).toList().toTypedArray()
        println(myArray)
        assertEquals(myArray.size,100)
    }

    @Test
    @DisplayName("should create a two dimensions Array")
    fun `should create a two dimensions Array`() {
        val twoDimensionsArray = arrayOf(
            arrayOf(123,456),
            arrayOf(789,321),
        )
        assertEquals(twoDimensionsArray[0][1],456)
        assertEquals(twoDimensionsArray[1][0],789)
    }

    @Test
    @DisplayName("should create a shallow copy array")
    fun `should create a shallow copy array`() {
        /*
            cópia rasa significa que a estrutura do array é copiada, mas os objetos internos são COMPARTILHADOS.
            Se modificarmos um objeto dentro do array copiado, o original também será afetado.
         */
        val originalArray = arrayOf(
            arrayOf(1, 2),
            arrayOf(3, 4)
        )

        // Criando uma cópia rasa (shallow copy)
        val shallowCopy = originalArray.copyOf()

        // Modificando o valor na cópia
        shallowCopy[0][0] = 99

        // Exibindo ambos os arrays
        assertEquals(originalArray[0][0],99)
        assertEquals(shallowCopy[0][0],99)
    }

    @Test
    @DisplayName("should create a deep copy array")
    fun `should create a deep copy array`() {
        /*
            A cópia profunda significa que uma nova estrutura é criada, e os objetos internos também são clonados.
            Alterações no array copiado NÃO AFETAM o original.
         */
        val originalArray = arrayOf(
            arrayOf(1, 2),
            arrayOf(3, 4)
        )

        // Criando uma cópia rasa (shallow copy)
        val deepCopy = originalArray.map { it.copyOf() }.toTypedArray()

        // Modificando o valor na cópia
        deepCopy[0][0] = 99

        // Exibindo ambos os arrays
        assertEquals(originalArray[0][0],1)
        assertEquals(deepCopy[0][0],99)
    }

    @Test
    @DisplayName("should return array values without temp variables")
    fun `should return array values without temp variables`() {
        val numbers = arrayOf(1,2,3,4,5)
        numbers[1] = numbers[2].also { numbers[2] = numbers[1] }

        assertEquals(1, numbers[0])
        assertEquals(3, numbers[1])
        assertEquals(2, numbers[2])
        assertEquals(4, numbers[3])
        assertEquals(5, numbers[4])
    }
}