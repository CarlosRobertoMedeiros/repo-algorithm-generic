package br.com.roberto.algorithm.bigOgrokkingalgorithms

import java.util.ArrayList
import java.util.LinkedList
import kotlin.random.Random
import kotlin.system.measureTimeMillis

class Exercise2 {

    /*
        Realizando uma comparação ao utilizar Lista encadeada(LinkedList) e Array(ArrayList)
        Levando em conta o tempo dentro da quantidade de interações
        Olhar o detalhamento da Linguagem ...
    */
    val values = 100_000

    fun timedArrayListInsertion(): Long {
        val random = Random.Default
        val arrayList = ArrayList<Int>()
        return measureTimeMillis {
            repeat(values) { arrayList.add(random.nextInt()) }
        }
    }

    fun timedLinkedListInsertion(): Long {
        val random = Random.Default
        val linkedList = LinkedList<Int>()
        return measureTimeMillis {
            repeat(values) { linkedList.add(random.nextInt()) }
        }
    }
}