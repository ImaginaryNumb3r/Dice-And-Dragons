package numerical

import numerical.Chance.Chances.coinFlip
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ChanceTest {
    companion object {
        private const val fractalFaces = 17
        private val oneThird  = Chance(1, 3)
        private val fractal  = Chance(1, fractalFaces)
    }

    @Test
    internal fun testComplementary() {
        assertEquals(coinFlip, coinFlip.complementary())
        assertEquals(oneThird * 2, oneThird.complementary())
        assertEquals(Chance(fractalFaces - 1, fractalFaces), fractal.complementary())
    }
}
