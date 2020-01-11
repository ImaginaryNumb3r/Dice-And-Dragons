package numerical

import tabletop.EdgeOfTheEmpire.abilityDie
import tabletop.EdgeOfTheEmpire.boostDie
import tabletop.EdgeOfTheEmpire.challengerDie
import tabletop.EdgeOfTheEmpire.difficultyDie
import tabletop.EdgeOfTheEmpire.forceDie
import tabletop.EdgeOfTheEmpire.proficiencyDie
import tabletop.EdgeOfTheEmpire.setbackDie
import tabletop.EventType.*
import org.junit.Assert.*
import org.junit.Test

class EventDieTest {

    @Test
    fun testFaces() {
        assertEquals( 6, boostDie.faces)
        assertEquals( 6, setbackDie.faces)
        assertEquals( 8, abilityDie.faces)
        assertEquals( 8, difficultyDie.faces)
        assertEquals( 12, proficiencyDie.faces)
        assertEquals( 12, challengerDie.faces)
        assertEquals( 12, forceDie.faces)
    }

    @Test
    fun testMean() {
        assertEquals( 1.0/3, boostDie.expectedValue(SUCCESS), 0.0)
        assertEquals( 2.0/3, boostDie.expectedValue(ADVANTAGE), 0.0)
        assertEquals( 1.0/3, boostDie.expectedValue(NOTHING), 0.0)

        assertEquals( 1.0/3, setbackDie.expectedValue(FAILURE), 0.0)
        assertEquals( 1.0/3, setbackDie.expectedValue(THREAT), 0.0)
        assertEquals( 1.0/3, setbackDie.expectedValue(NOTHING), 0.0)

        assertEquals( 5.0/8, abilityDie.expectedValue(SUCCESS), 0.0)
        assertEquals( 5.0/8, abilityDie.expectedValue(ADVANTAGE), 0.0)
        assertEquals( 1.0/8, abilityDie.expectedValue(NOTHING), 0.0)

        assertEquals( 1.0/2, difficultyDie.expectedValue(FAILURE), 0.0)
        assertEquals( 3.0/4, difficultyDie.expectedValue(THREAT), 0.0)
        assertEquals( 1.0/8, difficultyDie.expectedValue(NOTHING), 0.0)

        assertEquals( 1.0/12, proficiencyDie.expectedValue(TRIUMPH), 0.0)
        assertEquals( 9.0/12, proficiencyDie.expectedValue(SUCCESS), 0.0)
        assertEquals( 8.0/12, proficiencyDie.expectedValue(ADVANTAGE), 0.0)
        assertEquals( 1.0/12, proficiencyDie.expectedValue(NOTHING), 0.0)

        assertEquals( 1.0/12, challengerDie.expectedValue(DESPAIR), 0.0)
        assertEquals( 8.0/12, challengerDie.expectedValue(FAILURE), 0.0)
        assertEquals( 8.0/12, challengerDie.expectedValue(THREAT), 0.0)
        assertEquals( 1.0/12, challengerDie.expectedValue(NOTHING), 0.0)

        assertEquals( 8.0/12, forceDie.expectedValue(LIGHT), 0.0)
        assertEquals( 8.0/12, forceDie.expectedValue(DARK), 0.0)
        assertEquals( 1.0/12, forceDie.expectedValue(NOTHING), 0.0)
    }

    @Test
    fun testVariance() {
        assertEquals( 0.14814814814814817, boostDie.variance(SUCCESS), 0.0)
        assertEquals( 0.3333333333333334,  boostDie.variance(ADVANTAGE), 0.0)

        assertEquals( 0.14814814814814817, setbackDie.variance(FAILURE), 0.0)
        assertEquals( 0.14814814814814817, setbackDie.variance(THREAT), 0.0)

        assertEquals( 0.2890625, abilityDie.variance(SUCCESS), 0.0)
        assertEquals( 0.2890625, abilityDie.variance(ADVANTAGE), 0.0)

        assertEquals( 0.34375,   difficultyDie.variance(FAILURE), 0.0)
        assertEquals( 0.2265625, difficultyDie.variance(THREAT), 0.0)

        assertEquals( 0.2864583333333333, proficiencyDie.variance(SUCCESS), 0.0)
        assertEquals( 0.3333333333333334, proficiencyDie.variance(ADVANTAGE), 0.0)

        assertEquals( 0.3333333333333334, challengerDie.variance(FAILURE), 0.0)
        assertEquals( 0.3333333333333334, challengerDie.variance(THREAT), 0.0)

        assertEquals( 0.4629629629629631,  forceDie.variance(LIGHT), 0.0)
        assertEquals( 0.20370370370370375, forceDie.variance(DARK), 0.0)
    }
}
