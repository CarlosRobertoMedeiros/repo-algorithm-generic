package br.com.roberto.algorithm.bigO

class BigOSampleOne004 {

    /*
    * Big (O) - TEMPO QUADRÁTICO - O (n²)
    *
    * Quando o algoritmo tem a necessidade de executar
    * uma operação linear para cada valor dentro dos dados de entrada
    *
    * Obs: Caso 3 listas seria o O (n³) respeitando a mesma lógica
    *
    * Exemplo muito aplicado em consultas de lista de listas
    * OBS: ESSA É A SOLUÇÃO MAIS APLICADA PORÉM, NEM SEMPRE A MELHOR
    *
    * SEMPRE QUE FOR USAR  O (n²) PENSE EM OUTRA TÉCNICA, AQUI SEMPRE SERÁ LENTO
    */
    fun findCommonElements(listA : List<Int>, listB : List<Int>): List<Int> {
        val listC = mutableListOf<Int>()

        for (itemA in listA) {
            for (itemB in listB){
                if (itemA == itemB) listC.add(itemB)
            }
        }
        return listC
    }
}