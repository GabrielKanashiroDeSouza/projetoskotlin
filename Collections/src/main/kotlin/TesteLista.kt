fun main(){
   val joao=Funcionario("Joao",1000.0)
   val pedro=Funcionario("Pedro",2000.0)
   val maria=Funcionario("maria",4000.0)

    val funcionarios= listOf(joao,pedro,maria)

    funcionarios.forEach{println(it)}
    println("///////////////////")
    println(funcionarios.find { it.nome.toUpperCase()=="MARIA" })
}


data class Funcionario(
    val nome :String,
    val salario:Double

)