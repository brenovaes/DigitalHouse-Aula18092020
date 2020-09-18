package br.com.digitalhouse.exercicio1

data class Pessoa(var nome: String, var RG: Int) {
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if (other !is Pessoa) return false

        if(RG != other.RG) return false
        return true
    }
}