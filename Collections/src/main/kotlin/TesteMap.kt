fun main(){

    val pair: Pair <String,Double> = Pair("Joao",1000.0)
    val map1= mapOf(pair)

    map1.forEach{k,v ->println("Chave: $k - Valor:$v")}

    val map2= mapOf(
        "Pedro" to 2500.0,
        "Maria" to 1000.0
    )
   println("*****************")
    map2.forEach{k,v ->println("Chave: $k - Valor:$v")}

}