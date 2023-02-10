package tabletop.edge_of_the_empire

import numerical.DieSymbol
import numerical.SymbolicDie

object EdgeOfTheEmpire {
    /** D6 dice */
    val boostDie = SymbolicDie(DieSymbol(1, EoteSymbol.SUCCESS),   DieSymbol(1, EoteSymbol.ADVANTAGE),
                            DieSymbol(2, EoteSymbol.SUCCESS),   DieSymbol(3, EoteSymbol.ADVANTAGE, 2),
                            DieSymbol(4, EoteSymbol.ADVANTAGE), DieSymbol(5, EoteSymbol.NOTHING),
                            DieSymbol(6, EoteSymbol.NOTHING))

    val setbackDie = SymbolicDie(DieSymbol(1, EoteSymbol.FAILURE), DieSymbol(2, EoteSymbol.FAILURE),
                              DieSymbol(3, EoteSymbol.THREAT),  DieSymbol(4, EoteSymbol.THREAT),
                              DieSymbol(5, EoteSymbol.NOTHING), DieSymbol(6, EoteSymbol.NOTHING))

    /** D8 dice */
    val abilityDie = SymbolicDie(DieSymbol(1, EoteSymbol.SUCCESS, 2),
                              DieSymbol(2, EoteSymbol.SUCCESS),   DieSymbol(3, EoteSymbol.SUCCESS),
                              DieSymbol(4, EoteSymbol.SUCCESS),   DieSymbol(4, EoteSymbol.ADVANTAGE),
                              DieSymbol(5, EoteSymbol.ADVANTAGE, 2),
                              DieSymbol(6, EoteSymbol.ADVANTAGE), DieSymbol(7, EoteSymbol.ADVANTAGE),
                              DieSymbol(8, EoteSymbol.NOTHING))

    val difficultyDie = SymbolicDie(DieSymbol(1, EoteSymbol.FAILURE, 2),
                                 DieSymbol(2, EoteSymbol.FAILURE), DieSymbol(2, EoteSymbol.THREAT),
                                 DieSymbol(3, EoteSymbol.FAILURE), DieSymbol(4, EoteSymbol.THREAT, 2),
                                 DieSymbol(5, EoteSymbol.THREAT),  DieSymbol(6, EoteSymbol.THREAT),
                                 DieSymbol(7, EoteSymbol.THREAT),  DieSymbol(8, EoteSymbol.NOTHING))
    /** D12 dice */
    val proficiencyDie = SymbolicDie(DieSymbol(1,  EoteSymbol.TRIUMPH),
                                  DieSymbol(2,  EoteSymbol.SUCCESS),   DieSymbol(3,  EoteSymbol.SUCCESS, 2),
                                  DieSymbol(4,  EoteSymbol.SUCCESS),   DieSymbol(5,  EoteSymbol.SUCCESS, 2),
                                  DieSymbol(6,  EoteSymbol.SUCCESS),   DieSymbol(6,  EoteSymbol.ADVANTAGE),
                                  DieSymbol(7,  EoteSymbol.SUCCESS),   DieSymbol(7,  EoteSymbol.ADVANTAGE),
                                  DieSymbol(8,  EoteSymbol.SUCCESS),   DieSymbol(8,  EoteSymbol.ADVANTAGE),
                                  DieSymbol(9,  EoteSymbol.ADVANTAGE), DieSymbol(10, EoteSymbol.ADVANTAGE, 2),
                                  DieSymbol(11, EoteSymbol.ADVANTAGE, 2),
                                  DieSymbol(12, EoteSymbol.NOTHING))

    val challengerDie = SymbolicDie(DieSymbol(1,  EoteSymbol.DESPAIR),
                                 DieSymbol(2,  EoteSymbol.FAILURE), DieSymbol(3, EoteSymbol.FAILURE, 2),
                                 DieSymbol(4,  EoteSymbol.FAILURE), DieSymbol(5, EoteSymbol.FAILURE, 2),
                                 DieSymbol(6,  EoteSymbol.FAILURE), DieSymbol(6, EoteSymbol.THREAT),
                                 DieSymbol(7,  EoteSymbol.FAILURE), DieSymbol(7, EoteSymbol.THREAT),
                                 DieSymbol(8,  EoteSymbol.THREAT),  DieSymbol(9, EoteSymbol.THREAT, 2),
                                 DieSymbol(10, EoteSymbol.THREAT),  DieSymbol(11, EoteSymbol.THREAT, 2),
                                 DieSymbol(12, EoteSymbol.NOTHING))

    /** Other die **/
    val forceDie = SymbolicDie(DieSymbol(1,  EoteSymbol.DARK),  DieSymbol(2, EoteSymbol.DARK),
                            DieSymbol(3,  EoteSymbol.DARK),  DieSymbol(4, EoteSymbol.DARK),
                            DieSymbol(5,  EoteSymbol.DARK),  DieSymbol(6, EoteSymbol.DARK, 2),
                            DieSymbol(7,  EoteSymbol.DARK),  DieSymbol(8, EoteSymbol.LIGHT, 2),
                            DieSymbol(9,  EoteSymbol.LIGHT), DieSymbol(10, EoteSymbol.LIGHT, 2),
                            DieSymbol(10, EoteSymbol.LIGHT), DieSymbol(11, EoteSymbol.LIGHT, 2),
                            DieSymbol(12, EoteSymbol.NOTHING))
}
