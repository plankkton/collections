package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{println(it)}

    println("----------------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("----------------------------------")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
){
    override fun toString(): String =
        """
            nome:    $nome
            Salário: $salario
        """.trimIndent()
}