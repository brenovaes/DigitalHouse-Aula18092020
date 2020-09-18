package br.com.digitalhouse.exercicio4

data class Funcionario(val nome: String, val numeroDeRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if (other !is Funcionario) return false

        if(numeroDeRegistro != other.numeroDeRegistro) return false
        return true
    }
}