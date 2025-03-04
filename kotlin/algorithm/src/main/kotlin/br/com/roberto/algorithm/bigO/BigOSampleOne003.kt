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

        var firstNumber = 0
        var maxNumber = numbersSorted.size -1

        while (firstNumber <= maxNumber){
            val listIndex = firstNumber + (maxNumber - firstNumber) /2
            when {
                numbersSorted[listIndex] == target -> return listIndex
                numbersSorted[listIndex] < target -> firstNumber = listIndex + 1
                else -> maxNumber = listIndex -1
            }
        }
        return -1 // Elemento nao Encontrado
    }

    fun binarySearchText(list : Array<String>, target: String): Pair<Int,Int> {
        val numbersSorted = list.sortedArray()

        var firstNumber = 0
        var maxNumber = numbersSorted.size -1
        var iterations = 0

        while (firstNumber <= maxNumber){
            iterations++
            val listIndex = firstNumber + (maxNumber - firstNumber) /2
            when {
                numbersSorted[listIndex] == target -> return Pair(listIndex,iterations)
                numbersSorted[listIndex] < target -> firstNumber = listIndex + 1
                else -> maxNumber = listIndex -1
            }
        }
        return Pair(-1,iterations) // Elemento nao Encontrado
    }
}