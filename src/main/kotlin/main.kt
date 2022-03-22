package ru.netology

fun main() {
    val amount = 200000
    val commission = ((amount / 100) * 75) / 100
    println(
        if (commission < 3500) "Ваша комиссия составляет 3500 копеек"
        else "Ваша комиссия состовляет $commission копеек"
    )


}