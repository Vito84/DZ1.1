package ru.netology

const val COMMISSION = 0.75
const val MIN_COMMISSION = 35

fun main() {
    amount(COMMISSION, MIN_COMMISSION)

}

fun amount(
    COMMISSION: Double,
    MIN_COMMISSION: Int
) {
    print("Введите сумму перевода \n")
    val transferAmount = readln()?.toInt()
    val result = ((transferAmount * COMMISSION) / 100)
    val rub = result.toInt()
    val kop = (result * 100).toInt() % 100

    println(
        if (result < MIN_COMMISSION) "Ваша комиссия составляет 35 рублей 00 копеек"
        else "Ваша комиссия состовляет $rub рублей $kop копеек"
    )
}



