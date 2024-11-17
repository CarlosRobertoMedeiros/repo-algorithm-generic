package br.com.roberto.algorithm.bigO

class BigOSampleOne003 {

    /*
    * Big (O) - TEMPO LOGARÍTMICO - O (log n)
    *
    * Quando o algoritmo REDUZ o tamanho
    * dos dados de entrada a cada iteração
    *
    * Exemplo muito aplicado em árvore binária
    */
    fun binarySearchNumber(numbers : IntArray, target: Int): Int {
        val numbersSorted = numbers.sortedArray()

        var left = 0
        var right = numbersSorted.size -1

        while (left <= right){
            val mid = left + (right - left) / 2
            when {
                numbersSorted[mid] == target -> return mid
                numbersSorted[mid] < target -> left = mid + 1
                else -> right = mid -1
            }
        }
        return -1 // Elemento nao Encontrado
    }
}