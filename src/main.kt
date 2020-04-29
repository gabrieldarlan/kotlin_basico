fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta(titular = "Alex",numero =  1000)
    contaAlex.deposita(200.0)
    val contaFran = Conta(numero = 1001, titular = "fran")
    contaFran.deposita(300.0)
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)
//    println(contaAlex.titular)
//    println(contaAlex.numero)
//    println(contaAlex.saldo)

}

class Conta(
    var titular: String,
    val numero: Int = 0
) {

    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }


    private fun testaCopiasEReferencias() {
        val numerox = 10
        var numeroY = numerox
        numeroY++

        println("numerox $numerox")
        println("numeroY $numeroY")

        val contaJoao = Conta("Joao", 1002)
        val contaMaria = Conta("maria", 1003)

        println("titular conta joao: ${contaJoao.titular} ")
        println("titular conta maria: ${contaMaria.titular} ")
    }

    private fun testaLacos() {
        var i = 0
        while (i < 5) {
            val titular: String = "Alex $i"
            val numeroConta: Int = 1000 + i
            val saldo: Double = i + 10.0

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
}

private fun testaCondicoes(saldo: Double) {
    //o when substitui uma cadeia de if's e else if's
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        saldo < 0.0 -> println("conta é negativa")
    }
}

