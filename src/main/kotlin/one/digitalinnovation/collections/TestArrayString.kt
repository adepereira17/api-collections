package one.digitalinnovation.collections

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Adenilson"
    nomes[1] = "Maria"
    nomes[2] = "Darcy"

    println("=======================")

    for(nome in nomes){
        println(nome)
    }

    println("=======================")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("=======================")

    val nomesDois = arrayOf("Adenilson", "Maria", "Darcy R.")

    println("=======================")

    nomesDois.sort()

    nomesDois.forEach {
        println(it)
    }

    println("======================")
}