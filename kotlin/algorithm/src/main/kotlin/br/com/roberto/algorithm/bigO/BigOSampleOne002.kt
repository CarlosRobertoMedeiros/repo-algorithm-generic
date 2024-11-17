package br.com.roberto.algorithm.bigO

class BigOSampleOne002 {

    /*
    * Big (O) - TEMPO LINEAR - O (n)
    *
    * Quando o tempo do algoritmo é dependente do valor de n
    * Sendo que n são os dados de entrada
    *
    * A medida que a quantidade de números cresce no "numbers"
    * o tempo do seu algoritmo aumenta
    */

    fun printItens(numbers : Array<Int>): Unit {
        for (number in numbers){
            print(number)
        }
    }


    fun findMax(numbers: Array<Int>): Int {
        var max = 0
        for (number in numbers){
            if (number > max) max = number
        }
        return max
    }

    fun findSum(numbers: Array<Int>) :Int{
        var sum = 0
        for (number in numbers){
            sum +=number
        }
        return sum
    }

}