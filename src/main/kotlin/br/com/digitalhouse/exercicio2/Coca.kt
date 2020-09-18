package br.com.digitalhouse.exercicio2

data class Coca(val tamanho: Int, val preco: Double) {
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if (other !is Coca) return false

        if(tamanho != other.tamanho) return false
        return true
    }
}