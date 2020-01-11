package numerical

import kotlin.IllegalArgumentException

@Suppress("EqualsOrHashCode")
data class Chance(private val chance: Double) {
    constructor(base: Int, divider: Int): this(base.toDouble() / divider.toDouble())
    /** @throws IllegalArgumentException unless parameter [chance] is either 0 or 1 */
    constructor(chance: Int): this(chance.toDouble())

    init {
        if (chance < 0) throw IllegalArgumentException("Chance value must not be smaller zero")
        if (chance > 1) throw IllegalArgumentException("Chance value must not be greater than one")
    }

    operator fun times(other: Chance): Chance {
        return Chance(chance * other.chance)
    }

    /** @throws IllegalArgumentException if result is not a valid [Chance]  */
    operator fun times(scalar: Double): Chance = Chance(chance * scalar)
    /** @throws IllegalArgumentException if result is not a valid [Chance]  */
    operator fun times(scalar:  Int):   Chance = Chance(chance * scalar)
    /** @throws IllegalArgumentException if result is not a valid [Chance]  */
    operator fun plus( other: Chance):  Chance = Chance(chance + other.chance)
    /** @throws IllegalArgumentException if result is not a valid [Chance]  */
    operator fun minus(other: Chance):  Chance = Chance(chance - other.chance)

    fun complementary(): Chance {
        return Chance(1 - chance)
    }

    fun toDouble(): Double {
        return chance
    }

    override fun toString(): String {
        return chance.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Chance) return false

        // Make machine epsilon aware comparison of real numbers (ulp = unit in last place).
        return Doubles.equals(chance, other.chance)
    }

    companion object Chances {
        val always = Chance(1)
        val never = Chance(0)
        val coinFlip = Chance(0.5)
    }
}
