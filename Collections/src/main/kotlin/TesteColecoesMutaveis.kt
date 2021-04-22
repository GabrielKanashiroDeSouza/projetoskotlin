    fun main() {
        val joao = Funcionario("Joao", 2000.0, "CLT")
        val pedro = Funcionario("Pedro", 1000.0, "CLT")
        val maria = Funcionario("Maria", 4000.0, "PJ")

        val funcionarios = mutableListOf(joao, maria)
        funcionarios.forEach{println(it)}
        println("************")
        funcionarios.add(pedro)
        funcionarios.remove(maria)
        funcionarios.forEach{println(it)}

    }



