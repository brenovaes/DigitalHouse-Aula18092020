package br.com.digitalhouse.exercicio3

data class Aluno(val nome: String, val numeroDeAluno: Int){
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if (other !is Aluno) return false

        if(numeroDeAluno != other.numeroDeAluno) return false
        return true
    }
}