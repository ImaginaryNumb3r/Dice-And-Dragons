package numerical

import tabletop.star_wars_rpg.StarWarsRpgDie.abilityDie
import tabletop.star_wars_rpg.StarWarsRpgDie.boostDie
import tabletop.star_wars_rpg.StarWarsRpgDie.challengerDie
import tabletop.star_wars_rpg.StarWarsRpgDie.difficultyDie
import tabletop.star_wars_rpg.StarWarsRpgDie.forceDie
import tabletop.star_wars_rpg.StarWarsRpgDie.proficiencyDie
import tabletop.star_wars_rpg.StarWarsRpgDie.setbackDie
import org.junit.Assert.*
import org.junit.Test
import tabletop.star_wars_rpg.StarWarsRpgDie
import tabletop.star_wars_rpg.StarWarsRpgSymbol

class SymbolicDieTest {

    @Test
    fun testFaces() {
        assertEquals( 6, boostDie.faceCount)
        assertEquals( 6, setbackDie.faceCount)
        assertEquals( 8, abilityDie.faceCount)
        assertEquals( 8, difficultyDie.faceCount)
        assertEquals( 12, proficiencyDie.faceCount)
        assertEquals( 12, challengerDie.faceCount)
        assertEquals( 12, forceDie.faceCount)
    }

    @Test
    fun testMean() {
        assertEquals( 1.0/3, boostDie.expectedValue(StarWarsRpgSymbol.SUCCESS), 0.0)
        assertEquals( 2.0/3, boostDie.expectedValue(StarWarsRpgSymbol.ADVANTAGE), 0.0)
        assertEquals( 1.0/3, boostDie.expectedValue(StarWarsRpgSymbol.NOTHING), 0.0)

        assertEquals( 1.0/3, setbackDie.expectedValue(StarWarsRpgSymbol.FAILURE), 0.0)
        assertEquals( 1.0/3, setbackDie.expectedValue(StarWarsRpgSymbol.THREAT), 0.0)
        assertEquals( 1.0/3, setbackDie.expectedValue(StarWarsRpgSymbol.NOTHING), 0.0)

        assertEquals( 5.0/8, abilityDie.expectedValue(StarWarsRpgSymbol.SUCCESS), 0.0)
        assertEquals( 5.0/8, abilityDie.expectedValue(StarWarsRpgSymbol.ADVANTAGE), 0.0)
        assertEquals( 1.0/8, abilityDie.expectedValue(StarWarsRpgSymbol.NOTHING), 0.0)

        assertEquals( 1.0/2, difficultyDie.expectedValue(StarWarsRpgSymbol.FAILURE), 0.0)
        assertEquals( 3.0/4, difficultyDie.expectedValue(StarWarsRpgSymbol.THREAT), 0.0)
        assertEquals( 1.0/8, difficultyDie.expectedValue(StarWarsRpgSymbol.NOTHING), 0.0)

        assertEquals( 1.0/12, proficiencyDie.expectedValue(StarWarsRpgSymbol.TRIUMPH), 0.0)
        assertEquals( 9.0/12, proficiencyDie.expectedValue(StarWarsRpgSymbol.SUCCESS), 0.0)
        assertEquals( 8.0/12, proficiencyDie.expectedValue(StarWarsRpgSymbol.ADVANTAGE), 0.0)
        assertEquals( 1.0/12, proficiencyDie.expectedValue(StarWarsRpgSymbol.NOTHING), 0.0)

        assertEquals( 1.0/12, challengerDie.expectedValue(StarWarsRpgSymbol.DESPAIR), 0.0)
        assertEquals( 8.0/12, challengerDie.expectedValue(StarWarsRpgSymbol.FAILURE), 0.0)
        assertEquals( 8.0/12, challengerDie.expectedValue(StarWarsRpgSymbol.THREAT), 0.0)
        assertEquals( 1.0/12, challengerDie.expectedValue(StarWarsRpgSymbol.NOTHING), 0.0)

        assertEquals( 8.0/12, forceDie.expectedValue(StarWarsRpgSymbol.LIGHT), 0.0)
        assertEquals( 8.0/12, forceDie.expectedValue(StarWarsRpgSymbol.DARK), 0.0)
        assertEquals( 1.0/12, forceDie.expectedValue(StarWarsRpgSymbol.NOTHING), 0.0)
    }

    @Test
    fun testVariance() {
        assertEquals( 0.14814814814814817, boostDie.variance(StarWarsRpgSymbol.SUCCESS), 0.0)
        assertEquals( 0.3333333333333334,  boostDie.variance(StarWarsRpgSymbol.ADVANTAGE), 0.0)

        assertEquals( 0.14814814814814817, setbackDie.variance(StarWarsRpgSymbol.FAILURE), 0.0)
        assertEquals( 0.14814814814814817, setbackDie.variance(StarWarsRpgSymbol.THREAT), 0.0)

        assertEquals( 0.2890625, abilityDie.variance(StarWarsRpgSymbol.SUCCESS), 0.0)
        assertEquals( 0.2890625, abilityDie.variance(StarWarsRpgSymbol.ADVANTAGE), 0.0)

        assertEquals( 0.34375,   difficultyDie.variance(StarWarsRpgSymbol.FAILURE), 0.0)
        assertEquals( 0.2265625, difficultyDie.variance(StarWarsRpgSymbol.THREAT), 0.0)

        assertEquals( 0.2864583333333333, proficiencyDie.variance(StarWarsRpgSymbol.SUCCESS), 0.0)
        assertEquals( 0.3333333333333334, proficiencyDie.variance(StarWarsRpgSymbol.ADVANTAGE), 0.0)

        assertEquals( 0.3333333333333334, challengerDie.variance(StarWarsRpgSymbol.FAILURE), 0.0)
        assertEquals( 0.3333333333333334, challengerDie.variance(StarWarsRpgSymbol.THREAT), 0.0)

        assertEquals( 0.4629629629629631,  forceDie.variance(StarWarsRpgSymbol.LIGHT), 0.0)
        assertEquals( 0.20370370370370375, forceDie.variance(StarWarsRpgSymbol.DARK), 0.0)
    }
}
