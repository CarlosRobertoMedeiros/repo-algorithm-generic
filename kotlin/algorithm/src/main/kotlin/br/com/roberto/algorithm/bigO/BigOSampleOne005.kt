package br.com.roberto.algorithm.bigO

class BigOSampleOne005 {

    /*
    * Big (O) - TEMPO EXPONENCIAL - O (2”)
    *
    * Quando o algoritmo
    * resolve o problema de tamanho n recursivamente
    * com dois sub-problemas de tamanho n-1
    *
    * Exemplo muito aplicado em sequência de fibonacci
    * OBS: SOLUÇÃO EXTREMAMENTE LENTA
    *
    */
    fun fibonacciExponential(n: Int): Int {
        if (n <=1) return n
        return fibonacciExponential(n -1) + fibonacciExponential(n -2)
    }
}