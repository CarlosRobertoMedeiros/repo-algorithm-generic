package br.com.roberto.algorithm.bigOgrokkingalgorithms

class Exercise3SelectionSort {

    fun selectionSort(myArray: IntArray) : IntArray {

        for (i in 0 until myArray.size -1){
            var minIndex = i
            for (j in i + 1 until myArray.size){
                if (myArray[j] < myArray[minIndex]) {
                    minIndex = j
                }
            }
            if (minIndex != i){
                val temp = myArray[i]
                myArray[i] = myArray[minIndex]
                myArray[minIndex] = temp
            }
        }
        return myArray
    }
}