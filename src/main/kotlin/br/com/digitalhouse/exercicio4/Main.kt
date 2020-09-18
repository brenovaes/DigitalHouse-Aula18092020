package br.com.digitalhouse.exercicio4

import br.com.digitalhouse.exercicio3.Aluno

fun main() {
    val funcionario1 = Funcionario("José", 1)
    val funcionario2 = Funcionario("Maria", 2)
    val funcionario3 = Funcionario("Lucas", 3)
    val funcionario4 = Funcionario("Astolfo", 4)

    val listaFuncionarios = mutableListOf<Funcionario>(funcionario1, funcionario2, funcionario3, funcionario4)

    val funcionario5 = Funcionario("Sebastião", 4)
    println(listaFuncionarios.contains(funcionario5))

    for (funcionario in listaFuncionarios){
        println(funcionario5.numeroDeRegistro.equals(funcionario.numeroDeRegistro))
    }

}