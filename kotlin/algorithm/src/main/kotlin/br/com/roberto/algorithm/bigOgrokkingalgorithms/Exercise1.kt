package br.com.roberto.algorithm.bigOgrokkingalgorithms


class Exercise1 {

    /*
        Suponha que você tem uma lista com 128 nome e esteja
    fazendo uma pesquisa binária. Qual seria o número
    máximo de Etapas que você levaria para encontrar o
    nome Desejado ?
    */
    fun binarySearch(list: Array<String>, target: String): Pair<Int,Int> {
        var left = 0
        var right = list.size -1
        var iteractions = 0

        while (left <= right) {
                iteractions++
                val listIndex = left + (right - left) /2
                when {
                    list[listIndex] == target -> return Pair(listIndex,iteractions)
                    list[listIndex] < target -> left = listIndex + 1
                    else -> right = listIndex -1
                }
        }
        return Pair(-1,iteractions)
    }

}