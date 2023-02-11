package tabletop.star_wars_rpg

import symbolic.DieSymbol
import symbolic.SymbolicDie

object StarWarsRpgDie {
    /** D6 dice */
    val boostDie = SymbolicDie(
        DieSymbol(1, StarWarsRpgSymbol.SUCCESS),   DieSymbol(1, StarWarsRpgSymbol.ADVANTAGE),
                            DieSymbol(2, StarWarsRpgSymbol.SUCCESS),   DieSymbol(3, StarWarsRpgSymbol.ADVANTAGE, 2),
                            DieSymbol(4, StarWarsRpgSymbol.ADVANTAGE), DieSymbol(5, StarWarsRpgSymbol.NOTHING),
                            DieSymbol(6, StarWarsRpgSymbol.NOTHING)
    )

    val setbackDie = SymbolicDie(
        DieSymbol(1, StarWarsRpgSymbol.FAILURE), DieSymbol(2, StarWarsRpgSymbol.FAILURE),
                              DieSymbol(3, StarWarsRpgSymbol.THREAT),  DieSymbol(4, StarWarsRpgSymbol.THREAT),
                              DieSymbol(5, StarWarsRpgSymbol.NOTHING), DieSymbol(6, StarWarsRpgSymbol.NOTHING)
    )

    /** D8 dice */
    val abilityDie = SymbolicDie(
        DieSymbol(1, StarWarsRpgSymbol.SUCCESS, 2),
                              DieSymbol(2, StarWarsRpgSymbol.SUCCESS),   DieSymbol(3, StarWarsRpgSymbol.SUCCESS),
                              DieSymbol(4, StarWarsRpgSymbol.SUCCESS),   DieSymbol(4, StarWarsRpgSymbol.ADVANTAGE),
                              DieSymbol(5, StarWarsRpgSymbol.ADVANTAGE, 2),
                              DieSymbol(6, StarWarsRpgSymbol.ADVANTAGE), DieSymbol(7, StarWarsRpgSymbol.ADVANTAGE),
                              DieSymbol(8, StarWarsRpgSymbol.NOTHING)
    )

    val difficultyDie = SymbolicDie(
        DieSymbol(1, StarWarsRpgSymbol.FAILURE, 2),
                                 DieSymbol(2, StarWarsRpgSymbol.FAILURE), DieSymbol(2, StarWarsRpgSymbol.THREAT),
                                 DieSymbol(3, StarWarsRpgSymbol.FAILURE), DieSymbol(4, StarWarsRpgSymbol.THREAT, 2),
                                 DieSymbol(5, StarWarsRpgSymbol.THREAT),  DieSymbol(6, StarWarsRpgSymbol.THREAT),
                                 DieSymbol(7, StarWarsRpgSymbol.THREAT),  DieSymbol(8, StarWarsRpgSymbol.NOTHING)
    )
    /** D12 dice */
    val proficiencyDie = SymbolicDie(
        DieSymbol(1,  StarWarsRpgSymbol.TRIUMPH),
                                  DieSymbol(2,  StarWarsRpgSymbol.SUCCESS),   DieSymbol(3,  StarWarsRpgSymbol.SUCCESS, 2),
                                  DieSymbol(4,  StarWarsRpgSymbol.SUCCESS),   DieSymbol(5,  StarWarsRpgSymbol.SUCCESS, 2),
                                  DieSymbol(6,  StarWarsRpgSymbol.SUCCESS),   DieSymbol(6,  StarWarsRpgSymbol.ADVANTAGE),
                                  DieSymbol(7,  StarWarsRpgSymbol.SUCCESS),   DieSymbol(7,  StarWarsRpgSymbol.ADVANTAGE),
                                  DieSymbol(8,  StarWarsRpgSymbol.SUCCESS),   DieSymbol(8,  StarWarsRpgSymbol.ADVANTAGE),
                                  DieSymbol(9,  StarWarsRpgSymbol.ADVANTAGE), DieSymbol(10, StarWarsRpgSymbol.ADVANTAGE, 2),
                                  DieSymbol(11, StarWarsRpgSymbol.ADVANTAGE, 2),
                                  DieSymbol(12, StarWarsRpgSymbol.NOTHING)
    )

    val challengerDie = SymbolicDie(
        DieSymbol(1,  StarWarsRpgSymbol.DESPAIR),
                                 DieSymbol(2,  StarWarsRpgSymbol.FAILURE), DieSymbol(3, StarWarsRpgSymbol.FAILURE, 2),
                                 DieSymbol(4,  StarWarsRpgSymbol.FAILURE), DieSymbol(5, StarWarsRpgSymbol.FAILURE, 2),
                                 DieSymbol(6,  StarWarsRpgSymbol.FAILURE), DieSymbol(6, StarWarsRpgSymbol.THREAT),
                                 DieSymbol(7,  StarWarsRpgSymbol.FAILURE), DieSymbol(7, StarWarsRpgSymbol.THREAT),
                                 DieSymbol(8,  StarWarsRpgSymbol.THREAT),  DieSymbol(9, StarWarsRpgSymbol.THREAT, 2),
                                 DieSymbol(10, StarWarsRpgSymbol.THREAT),  DieSymbol(11, StarWarsRpgSymbol.THREAT, 2),
                                 DieSymbol(12, StarWarsRpgSymbol.NOTHING)
    )

    /** Other die **/
    val forceDie = SymbolicDie(
        DieSymbol(1,  StarWarsRpgSymbol.DARK),  DieSymbol(2, StarWarsRpgSymbol.DARK),
                            DieSymbol(3,  StarWarsRpgSymbol.DARK),  DieSymbol(4, StarWarsRpgSymbol.DARK),
                            DieSymbol(5,  StarWarsRpgSymbol.DARK),  DieSymbol(6, StarWarsRpgSymbol.DARK, 2),
                            DieSymbol(7,  StarWarsRpgSymbol.DARK),  DieSymbol(8, StarWarsRpgSymbol.LIGHT, 2),
                            DieSymbol(9,  StarWarsRpgSymbol.LIGHT), DieSymbol(10, StarWarsRpgSymbol.LIGHT, 2),
                            DieSymbol(10, StarWarsRpgSymbol.LIGHT), DieSymbol(11, StarWarsRpgSymbol.LIGHT, 2),
                            DieSymbol(12, StarWarsRpgSymbol.NOTHING)
    )
}
