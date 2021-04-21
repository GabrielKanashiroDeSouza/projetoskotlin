package one.digitalInnovation.Collections

fun main() {
    println("Digite o valor  do vetor: /n")
    val nvalues = IntArray(readLine()!!.toInt())

    for(i in nvalues) {
        println("digite o valor dentro do vetor:")
        nvalues[i] = (readLine()!!.toInt())
    }
    nvalues.forEach {
        println (it)

    }
}

