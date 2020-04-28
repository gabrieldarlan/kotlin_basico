fun main() {
    println("Bem vindo ao Bytebank")

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

//    testaCondicoes(saldo)

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

