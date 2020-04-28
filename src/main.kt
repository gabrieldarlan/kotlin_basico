fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    contaAlex.saldo += 50.0
    println("depositando na conta do alex")
    deposita(contaAlex, 50.0)
    println(contaAlex.saldo)
    println("depositando na conta da fran")
    deposita(contaFran, 70.0)
    println(contaFran.saldo)
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

private fun testaCopiasEReferencias() {
    val numerox = 10
    var numeroY = numerox
    numeroY++

    println("numerox $numerox")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "joao"
    var contaMaria = Conta()
    contaMaria.titular = "maria"

    println("titular conta joao: ${contaJoao.titular} ")
    println("titular conta maria: ${contaMaria.titular} ")
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

}

private fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
/*    for (i in 5 downTo 1) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()

    }*/
}

private fun testaCondicoes(saldo: Double) {
    //o when substitui uma cadeia de if's e else if's
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        saldo < 0.0 -> println("conta é negativa")
    }
}

