const val MIN_COMMISSION = 35.00

fun main() {
    print("Введите сумму перевода: ")
    val amount = readln().toFloatOrNull()
    if (amount == null || amount <= 0) {
        println("Некорректный ввод")
        return
    }
    val commission = amount * 0.75 / 100

    if (commission <= MIN_COMMISSION) {
        val result = amount + MIN_COMMISSION
        println("Комиссия за перевод: $MIN_COMMISSION руб")
        println("Итоговая сумма: $result руб")
    } else {
        val result = amount + commission
        println("Комиссия за перевод: $commission руб")
        println("Итоговая сумма: $result руб")
    }
}
