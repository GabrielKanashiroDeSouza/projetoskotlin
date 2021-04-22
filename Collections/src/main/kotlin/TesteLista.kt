fun main(){
   val joao=Funcionario("Joao",2000.0,"CLT")
   val pedro=Funcionario("Pedro",1000.0,"CLT")
   val maria=Funcionario("Maria",4000.0,"PJ")

    val funcionarios= listOf(joao,pedro,maria)

    funcionarios.forEach{println(it)}
    println("///////////////////")
    println(funcionarios.find { it.nome.toUpperCase()=="MARIA" })

    println("---------------")
    funcionarios.sortedBy { it.salario }
        .forEach{println(it)}

    println ("--------------------")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach{println(it)}

    println("*********************")
    val funcionarios1=setOf(joao,pedro)
    val funcionarios2=setOf(maria)
    val resultUnion=funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}
    println("*********************")
    val funcionarios3= setOf(joao,pedro,maria)

    val resultSubtract=funcionarios3
        .subtract(funcionarios2)
        .forEach{println(it)}

    println("*********************")

val resultIntersect=funcionarios3.intersect(funcionarios2)



}


data class Funcionario(
    val nome :String,
    val salario:Double,
    val tipoContrato:String

)