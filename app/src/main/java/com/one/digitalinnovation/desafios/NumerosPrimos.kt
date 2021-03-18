package com.one.digitalinnovation.desafios

fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()
    var qtdDiv: Int

    for (t in 1..n) {
        //val num = readLine()!!.toInt()
        val d = readLine()!!.toDouble()
        //val raiz = Math.sqrt(d)
        var num: Long = 0
        var verPrimo = 0
        qtdDiv = 0

        if (d <= 1.0) {
            qtdDiv = 1
            verPrimo = 1
        }

        if(d == 2.0) {
            qtdDiv = 2
            verPrimo = 1
        }

        if(d != 2.0 && d % 2 == 0.0) {
            qtdDiv = 1
            verPrimo = 1
        }

        num = d.toLong()

        if(verPrimo == 0) {
            qtdDiv = 2
            for (i in 2..num) {
                if(i*i <= num) {
                    if ((num % i) == 0L) {
                        qtdDiv = 1
                        break
                    }
                } else {
                    break
                }
            }
        }
        if(qtdDiv == 2) {
            println("Prime")
        }else {
            println("Not Prime")
        }
    }
}