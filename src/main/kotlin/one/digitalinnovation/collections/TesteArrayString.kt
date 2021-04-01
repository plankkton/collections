package one.digitalinnovation.collections

fun main(){
    val nomes = Array<String>(3){""}
    //funciona sem precisar especificar o tipo <String>

    nomes[0]= "Maria"
    nomes[1]= "Zilmar"
    nomes[2]= "Jose"

    for (n in nomes){
        println(n)
    }
    println("---------------------")
    nomes.sort()
    nomes.forEach{println(it)}

    println("---------------------")

    val nomes2 = arrayOf("Maria","Zilmar","pedro")
    nomes2.sort()
    nomes2.forEach{println(it)}
    //não foi falado em aula, mas este método é case sensitive
    //a linha não ordena direito porque "pedro" não começa com P maiúsculo
    //logo, a linha ordenará primeiro palavras com letras maiúsculas
    //e só depois ordenará as minúsculas
}