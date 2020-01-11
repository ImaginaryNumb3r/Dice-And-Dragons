package numerical

import java.lang.Integer.max
import java.lang.Math.min

/**
 * The abstraction of a die roll after or before any modifiers apply.
 * Therefore, the roll can be negative or be greater than the amount of faces.
 */
data class DieRoll(val roll: Int, val die: Die) {
    private val faces = die.faces

    constructor(roll: Int, dieFaces: Int) : this(roll, Die(dieFaces))

    operator fun plus(hitMod: Int): DieRoll {
        return DieRoll(roll + hitMod, die)
    }

    fun chance(): Chance {
        var roll = max(0, roll)
        roll = min(faces, roll)

        return Chance(roll, faces)
    }

    fun toDouble(): Double {
        return chance().toDouble()
    }

    fun complementary(): DieRoll {
        return DieRoll(faces - roll, die)
    }

    /**
     * A negative modifier where you must roll the die again if you succeeded.
     */
    fun reRollSuccess(): Chance {
        val chance = chance()
        val reRoll = chance.complementary() * chance

        return chance - reRoll
    }

    /**
     * A positive modifier where you must roll the die again if you failed.
     */
    fun reRollMiss(): Chance {
        val chance = chance()
        val reRoll = chance.complementary() * chance

        return chance + reRoll
    }

    companion object DieRolls {
        val none = DieRoll(0, 1)
        val always = DieRoll(1, 1)
        val coinFlip  = DieRoll(1, 2)
    }
}
