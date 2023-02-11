package util

import java.math.RoundingMode
import kotlin.math.abs
import kotlin.math.max

class Doubles {

    companion object {
        fun equals(first: Double, second: Double): Boolean {
            // Make machine epsilon aware comparison of real numbers (ulp = unit in last place).
            val epsilon = Math.ulp(max(first, second))
            return abs(first - second) <= epsilon
        }

        fun trimDouble(value: Double, newScale: Int = 2): String {
            return value.toBigDecimal()
                .setScale(newScale, RoundingMode.HALF_EVEN)
                .toString()
        }
    }
}

fun Double.shortStr(i: Int = 2): String {
    return toString(i)
}

fun Double.toString(i: Int): String {
    return Doubles.trimDouble(this, i)
}

fun String.padToSize(length: Int): String {
    val padding = IntArray(length - this.length).map { ' ' }.joinToString("")

    return this + padding
}
