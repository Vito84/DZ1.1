package ru.netology

fun main() {
    val amount = 100000
    val minCommission = 3500
    val commission = ((amount / 100) * 0.75).toInt()
    println(
        if (commission < minCommission) "Ваша комиссия составляет 3500 копеек"
        else "Ваша комиссия состовляет $commission копеек"
    )


}