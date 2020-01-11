package numerical

import kotlin.math.sqrt

data class Die(val faces: Int) : Iterable<Int> {

    init {
        assertFaceCount(faces)
    }

    fun minChance() = Chance(1, faces)

    fun on(roll: Int): Chance {
        return ascendingChance(roll)
    }

    fun roll(roll: Int): DieRoll {
        return DieRoll(roll, this)
    }

    fun ascendingChance(roll: Int): Chance {
        assertFaceCount(roll)
        // Since hitting on a 20 with a D20 gives you exactly one face you can hit, you must add +1.
        val successFaceCount = faces - roll + 1

        return Chance(successFaceCount, faces)
    }

    fun descendingChance(roll: Int): Chance {
        assertFaceCount(roll)
        // Since hitting on a 20 with a D20 gives you exactly one face you can hit, you must add +1.

        return Chance(roll, faces)
    }

    fun mean(): Double {
        return (faces + 1).toDouble() / 2
    }

    fun variance(): Double  {
        val mean = mean()
        var dev = 0.0

        for (value in this) {
            val delta = value - mean
            dev += delta * delta
        }

        return dev / faces
    }

    fun standardDeviation(): Double {
        return sqrt(variance())
    }

    private fun assertFaceCount(roll: Int) {
        if (roll < 0) throw IllegalArgumentException("Die roll must not be negative")
        if (roll == 0) throw IllegalArgumentException("Die roll must not be zero")
        if (roll > faces) throw IllegalArgumentException("Die roll must not exceed face count")
    }

    override fun toString(): String {
        return "D$faces"
    }

    override fun iterator(): Iterator<Int> {
        return (1..faces).iterator()
    }

    /**
     * Returns the list of chances
     */
    fun chances(): List<Chance> {
        return (1..faces)
            .map { Chance(it, faces) }
            .toList()
    }

    fun faceList(): List<Int> {
        return (1..faces)
            .toList()
    }

    companion object {
        val D4 = Die(4)
        val D6 = Die(6)
        val D8 = Die(8)
        val D12 = Die(12)
        val D20 = Die(20)
    }
}
