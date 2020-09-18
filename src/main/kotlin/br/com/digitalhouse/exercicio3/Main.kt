package br.com.digitalhouse.exercicio3

fun main() {
    val aluno1 = Aluno("José", 1)
    val aluno2 = Aluno("Maria", 2)
    val aluno3 = Aluno("Lucas", 3)
    val aluno4 = Aluno("Astolfo", 4)

    val listaAluno = mutableListOf<Aluno>(aluno1, aluno2, aluno3, aluno4)

    val aluno5 = Aluno("Sebastião", 4)
    println(listaAluno.contains(aluno5))

    for (aluno in listaAluno){
        println(aluno5.numeroDeAluno.equals(aluno.numeroDeAluno))
    }

}