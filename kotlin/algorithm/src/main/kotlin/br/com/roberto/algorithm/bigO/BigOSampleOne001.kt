package br.com.roberto.algorithm.bigO

class BigOSampleOne001 {

    /*
    * 1. Encontre o Item que aumenta mais rapidamente
    * 2. Remova o coeficiente
    *
    * T = an + b = O(n)
    *
    * Resultado
    *
    * O algoritmo O(n) cresce a medida que o tamanho do array aumenta
    * Prefira se possível um algoritomo O(1) por ser constante
    *
    *
    * */
    fun findSum(numbers: Array<Int>) :Int{
        var sum = 0
        for (number in numbers){
            sum +=number
        }
        return sum
    }
}