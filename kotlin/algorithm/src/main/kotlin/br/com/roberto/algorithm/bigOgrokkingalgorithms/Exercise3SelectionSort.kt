package br.com.roberto.algorithm.bigOgrokkingalgorithms


enum class Sorted(val compare: (Int, Int) -> Boolean) {
    ASC(compare = { a, b -> a < b }),
    DESC(compare = { a, b -> a > b })
}

class Exercise3SelectionSort {

    fun selectionSorted(myArray: IntArray, sorted: Sorted=Sorted.ASC): IntArray {
        val arrayCopied = myArray.copyOf()
        val comparator: (Int, Int) -> Boolean = when (sorted) {
            Sorted.ASC -> { a, b -> a < b }
            Sorted.DESC -> { a, b -> a > b }
        }

        for (i in 0 until arrayCopied.size - 1) {
            var selectedIndex = i

            for (j in i + 1 until arrayCopied.size) {
                if (comparator(arrayCopied[j], arrayCopied[selectedIndex])) {
                    selectedIndex = j
                }
            }

            if (selectedIndex != i) {
                arrayCopied[i] = arrayCopied[selectedIndex].also { arrayCopied[selectedIndex] = arrayCopied[i] }
            }
        }
        return arrayCopied
    }
}


// Link Support: https://www.youtube.com/watch?v=oNoso-BOFp4