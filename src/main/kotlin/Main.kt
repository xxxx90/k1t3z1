fun main(args: Array<String>) {

    val Seconds = 110
    var text = when (Seconds) {

        in 1..60 -> {
            "Был только что"
        }
        in 61..60 * 60 -> {
            "Был " + minuts(Seconds) + " назад"
        }
        in 60 * 60 + 1..24 * 60 * 60 -> {
            "Был " + hour(Seconds) + " назад"
        }
        in 86401..172800 -> {
            "Был вчера"
        }
        in 172801..259200 -> {
            "Был позавчера"
        }
        else -> {
            "Был давно"
        }
    }
    println(text)
}

fun hour(Seconds: Int): String {
    val Hour = Seconds / 3600
    return when (Hour % 10) {
        1 -> {
            if (Hour === 11) {
                Hour.toString() + " часов"
            } else {
                Hour.toString() + " час"
            }
        }

        2, 3, 4 -> {
            if (Hour > 11 && Hour < 15) {
                Hour.toString() + " часов"
            } else Hour.toString() + " часа"
        }

        else -> {
            Hour.toString() + " часов"
        }
    }
}
fun minuts(Seconds: Int): String {
    val Minuts = Seconds / 60
    return when (Minuts % 10) {
        1 -> {
            if (Minuts === 11) {
                Minuts.toString() + " минут"
            } else {
                Minuts.toString() + " минуту"
            }
        }

        2, 3, 4 -> {
            if (Minuts > 11 && Minuts < 15) {
                Minuts.toString() + " минут"
            } else Minuts.toString() + " минуты"
        }
        else -> {
            Minuts.toString() + " минут"
        }
    }
}

