package br.com.digitalhouse.exercicio1

fun main() {
    val pessoa1 = Pessoa("João", 12345)
    val pessoa2 = Pessoa("José", 12345)
    println(pessoa1.equals(pessoa2))

    println(pessoa1.RG.equals(pessoa2.RG))
}