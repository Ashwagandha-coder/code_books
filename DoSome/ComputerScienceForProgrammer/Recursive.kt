/**
  - Пример классического цикла
  - Пример рекурсии
  - Пример tailrec

 */


fun factorial(value : Int): Int {

    var x: Int = 1

    for (i in 1..value)
        x = x * i

    return x
}

fun rec(value: Int): Int {

    if (value == 1) return 1

    return value * rec(value - 1)
}

tailrec fun rec(value: Int): Int {

    if (value == 1) return 1

    return value * rec(value - 1)
}

