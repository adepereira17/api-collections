package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("===========================")
    for(salario in salarios){
        println(salario)
    }

    println("===========================")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média de salários: ${salarios.average()}")

    println("===========================")
    println("Salários maiores que R$ 2.500,00:")
    var salariosMaiorQue2500 = salarios.filter{it > 2500.0}
    salariosMaiorQue2500.forEach{
        println(it)
    }

}