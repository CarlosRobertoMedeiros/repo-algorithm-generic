package br.com.roberto.algorithm.bigO

class BigOSampleOne001 {

    /*
    * Big (O) - TEMPO CONSTANTE - O (1)
    *
    * Quando o algoritmo executará sempre no mesmo tempo
    * Independente da quantidade de dados que receber
    *
    */
    fun printMessage(message: String) : String {
        //print(message)
        return message
    }

    fun returnValue(value: Int): Int {
        return value
    }

    fun returnArrayPosition(number : Array<Int>) : Int {
        return number[0]
    }


}