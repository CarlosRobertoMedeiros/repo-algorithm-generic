package br.com.roberto.algorithm.bigOgrokkingalgorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Exercise1Test{
    private lateinit var exercise1: Exercise1

    @BeforeEach
    fun setup(){
        exercise1 = Exercise1()
    }

    /**
     * Exemplo de aplicação do exercício 1
     */
    @Test
    @DisplayName("should return the position where find the target text with 128 names")
    fun `should print the target value with 128 names`(){
        val namesList = arrayOf(
            "Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena",
            "Igor", "Juliana", "Kleber", "Larissa", "Marcos", "Natália", "Otávio", "Priscila",
            "Rafael", "Sabrina", "Tiago", "Vanessa", "André", "Beatriz", "Caio", "Débora",
            "Emerson", "Flávia", "Gustavo", "Heloísa", "Isabela", "João", "Kamila", "Leonardo",
            "Mirella", "Nathan", "Olga", "Paulo", "Queila", "Ricardo", "Simone", "Tatiane",
            "Ubirajara", "Vitor", "William", "Xavier", "Yasmin", "Zilda", "Adriano", "Bianca",
            "César", "Denise", "Eliane", "Fábio", "Giovana", "Henrique", "Ingrid", "Jéssica",
            "Kaique", "Luana", "Mateus", "Nicole", "Orlando", "Patrícia", "Quirino", "Renata",
            "Samuel", "Talita", "Ursula", "Viviane", "Wagner", "Ximena", "Yuri", "Zuleide",
            "Alex", "Brenda", "Cristiano", "Darlene", "Elias", "Fabiana", "Gilberto", "Hudson",
            "Ivana", "Jonas", "Karina", "Lorena", "Murilo", "Neide", "Osmar", "Pamela",
            "Rogério", "Sandra", "Tércio", "Valéria", "Washington", "Xander", "Yago", "Zoraide",
            "Alice", "Breno", "Cintia", "Diego", "Edson", "Felipe", "Gabriela", "Heitor",
            "Ilana", "Jorge", "Kelly", "Lucas", "Mônica", "Nicolas", "Otávia", "Pedro",
            "Raquel", "Silvio", "Tânia", "Vinícius", "Wesley", "Xenia", "Yara", "Zacarias",
            "Arthur", "Bernardo", "Clarice", "Dorival", "Elisa", "Fernando", "Giovanni","Humberto"
        )
        val target = "Zuleide"
        val (returnValue, iteractions) = exercise1.binarySearch(namesList.sortedArray(), target)

        assertEquals(127, returnValue) // Zuleide está na posição 127 do array após ordenado
        assertEquals(8, iteractions) // Esperado 8 iterações, conforme explicado, excedeu devido a última pesquisa
    }

    /**
     * Exemplo de aplicação do exercício 2
     */
    @Test
    @DisplayName("should return the position where find the target text with 256 names")
    fun `should print the target value with 256 names`(){
        val namesList = arrayOf(
            "Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana",
            "Kleber", "Larissa", "Marcos", "Natália", "Otávio", "Priscila", "Rafael", "Sabrina", "Tiago", "Vanessa",
            "André", "Beatriz", "Caio", "Débora", "Emerson", "Flávia", "Gustavo", "Heloísa", "Isabela", "João",
            "Kamila", "Leonardo", "Mirella", "Nathan", "Olga", "Paulo", "Queila", "Ricardo", "Simone", "Tatiane",
            "Ubirajara", "Vitor", "William", "Xavier", "Yasmin", "Zilda", "Adriano", "Bianca", "César", "Denise",
            "Eliane", "Fábio", "Giovana", "Henrique", "Ingrid", "Jéssica", "Kaique", "Luana", "Mateus", "Nicole",
            "Orlando", "Patrícia", "Quirino", "Renata", "Samuel", "Talita", "Ursula", "Viviane", "Wagner", "Ximena",
            "Yuri", "Zuleide", "Alex", "Brenda", "Cristiano", "Darlene", "Elias", "Fabiana", "Gilberto", "Hudson",
            "Ivana", "Jonas", "Karina", "Lorena", "Murilo", "Neide", "Osmar", "Pamela", "Rogério", "Sandra",
            "Tércio", "Valéria", "Washington", "Xander", "Yago", "Zoraide", "Alice", "Breno", "Cintia", "Diego",
            "Edson", "Felipe", "Gabriela", "Heitor", "Ilana", "Jorge", "Kelly", "Lucas", "Mônica", "Nicolas",
            "Otávia", "Pedro", "Raquel", "Silvio", "Tânia", "Vinícius", "Wesley", "Xenia", "Yara", "Zacarias",
            "Arthur", "Bernardo", "Clarice", "Dorival", "Elisa", "Fernando", "Giovanni", "Humberto", "Amanda",
            "Beto", "Carla", "Diego", "Eduarda", "Fábio", "Gabrielle", "Hugo", "Igor", "Jonatas", "Karla",
            "Larissa", "Mariana", "Neto", "Olga", "Paula", "Quésia", "Renan", "Simone", "Tatiane", "Ursula",
            "Vanessa", "Walter", "Ximena", "Yara", "Zélia", "Anderson", "Bruna", "Cláudia", "Douglas", "Emília",
            "Fábio", "Giovani", "Hilda", "Iago", "Joaquim", "Kelvin", "Lucas", "Mário", "Nayara", "Olívia",
            "Patrícia", "Quirino", "Rafaela", "Sílvia", "Tarsila", "Ubaldo", "Vera", "Waldemar", "Xuxa", "Yasmin",
            "Zacarias", "Arthur", "Bruna", "Cesar", "Davi", "Eliana", "Fernando", "Gustavo", "Helena", "Irene",
            "Jonas", "Karina", "Lúcio", "Mauro", "Nicolau", "Otávio", "Pablo", "Ricardo", "Sérgio", "Tais",
            "Valeria", "Wesley", "Xuxa", "Yago", "Zelda", "Adriana", "Breno", "Cíntia", "Diego", "Eliane",
            "Fabio", "Gilson", "Hugo", "Iara", "Janaina", "Kelly", "Leandro", "Marcio", "Nathalia", "Otávio"
        )
        val target = "Amanda"
        val (returnValue, iteractions) = exercise1.binarySearch(namesList.sortedArray(), target)

        assertEquals(4, returnValue) // Amanda está na posição 4 do array após ordenado
        assertEquals(8, iteractions) // Esperado 8 iterações, conforme explicado, não excedeu devido a última pesquisa
    }
}