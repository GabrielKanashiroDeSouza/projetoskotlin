
fun main(){
    println("digite o tamanho da array: \n" )
    val nvalues=IntArray(readLine()!!.toInt())

    for (i in nvalues.indices){
        println("Digite o valor dentro do array "+i)
        nvalues[i]= readLine()!!.toInt()

    }
    nvalues.forEach {
        println(it)


    }

}