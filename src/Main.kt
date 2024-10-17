fun checkString(input: String) {
    val alf = '0'..'9'
    var isValid = true

    input.forEach { char ->
        if (char !in alf) {
            isValid = false
        }
    }

    if (isValid) {
        println("Успех: Строка содержит только цифры.")
    } else {
        println("Ошибка: Строка содержит недопустимые символы.")
    }
}

fun main() {
    // Task 3
    checkString("12345")  // Успех: Строка содержит только цифры.
    checkString("123a5")  // Ошибка: Строка содержит недопустимые символы.
    checkString("987654") // Успех: Строка содержит только цифры.
}