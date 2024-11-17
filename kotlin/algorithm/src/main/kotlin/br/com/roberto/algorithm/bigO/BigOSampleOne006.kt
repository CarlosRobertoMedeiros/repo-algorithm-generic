package br.com.roberto.algorithm.bigO

class BigOSampleOne006 {

    /*
    * Big (O) - TEMPO FATORIAL - O (n!)
    *
    * Quando o algoritmo
    * cresce de forma fatorial de acordo com os dados de entrada
    *
    * Exemplo muito aplicado em fatorial
    * OBS: NUNCA VI ESSE PADRÃO OCORRENDO
    *
    */
    fun factorial(number: Int): Int {
        if (number==0) return 1
        return number * factorial(number-1)
    }
}