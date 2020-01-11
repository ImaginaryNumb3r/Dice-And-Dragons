package numerical

import numerical.Chance.Chances.coinFlip
import numerical.Die.Companion.D20
import numerical.Die.Companion.D6
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class DieTest {

    @Test
    internal fun testOnlyOneFaceSuccess() {
        // Testing chances for hitting only on one face.
        assertEquals(Chance(1, 6), D6.ascendingChance(6))
        assertEquals(Chance(1, 20), D20.ascendingChance(20))
        assertEquals(Chance(1, 6), D6.descendingChance(1))
        assertEquals(Chance(1, 20), D20.descendingChance(1))
    }

    /**
     * Tests chances where the ascending and descending chance is identical.
     */
    @Test
    internal fun testChance() {
        // Testing chances for hitting at all times
        assertEquals(Chance(1), D6.ascendingChance(1))
        assertEquals(Chance(1), D20.ascendingChance(1))
1
        // Testing chances for hitting at all times
        assertEquals(coinFlip, D6.ascendingChance(4))
        assertEquals(coinFlip, D6.descendingChance(3))

        assertEquals(coinFlip, D20.ascendingChance(11))
        assertEquals(coinFlip, D20.descendingChance(10))
    }

    @Test
    internal fun testMean() {
        assertEquals(3.5 , D6.mean())
        assertEquals(10.5 , D20.mean())
    }

    @Test
    internal fun testStandardDeviation() {
        assertEquals(D6.standardDeviation() * D6.standardDeviation() , D6.variance())
        assertEquals(2.9166666666666665, D6.variance())
        assertEquals(1.707825127659933, D6.standardDeviation())

        assert(Doubles.equals(D20.standardDeviation() * D20.standardDeviation(), D20.variance()))
        assertEquals(33.25, D20.variance())
        assertEquals(5.766281297335398 , D20.standardDeviation())
    }

    @Test
    internal fun testToString() {
        assertEquals("D6", D6.toString())
        assertEquals("D20", D20.toString())
    }
}
