package one.digitalinnovation.collections

import Funcionario

fun main(){
    val joao= Funcionario("Joao",2000.0,"CLT")
    val pedro =Funcionario("pedro",1000.0,"PJ")
    val maria =Funcionario("maria",3000.0,"CLT")


    val repositorio=Repositorio<Funcionario>()

     repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(pedro.nome,pedro)

    println(repositorio.findBy(joao.nome))
    println("***************")
    println(repositorio.findAll())
    repositorio.remover(maria.nome)
    println(repositorio.findAll())



}
