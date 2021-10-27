/*
1 - Faça um programa que leia um valor e imprima sua tabuada (aceite apenas números entre 1 e 10).
Imprima, logo em seguida, a tabuada ao contrário
 */
fun main(args: Array<String>) {

    var num =0
    println("Digite um número para que seja calculada sua tabuada: ")
    num = readLine()!!.toInt()

    for (item in 1..10){
        println("$num X $item = ${num * item}")
    }

    println("Em ordem decrescente, a tabuada fica da seguinte forma: ")

    for (item in 10 downTo 1) {
        println("$num X $item = ${num * item}")
    }

}