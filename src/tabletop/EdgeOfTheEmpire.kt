package tabletop

import numerical.DieEvent
import numerical.EventDie

object EdgeOfTheEmpire {
    /** D6 dice */
    val boostDie = EventDie(DieEvent(1, EventType.SUCCESS),   DieEvent(1, EventType.ADVANTAGE),
                            DieEvent(2, EventType.SUCCESS),   DieEvent(3, EventType.ADVANTAGE, 2),
                            DieEvent(4, EventType.ADVANTAGE), DieEvent(5, EventType.NOTHING),
                            DieEvent(6, EventType.NOTHING))

    val setbackDie = EventDie(DieEvent(1, EventType.FAILURE), DieEvent(2, EventType.FAILURE),
                              DieEvent(3, EventType.THREAT),  DieEvent(4, EventType.THREAT),
                              DieEvent(5, EventType.NOTHING), DieEvent(6, EventType.NOTHING))

    /** D8 dice */
    val abilityDie = EventDie(DieEvent(1, EventType.SUCCESS, 2),
                              DieEvent(2, EventType.SUCCESS),   DieEvent(3, EventType.SUCCESS),
                              DieEvent(4, EventType.SUCCESS),   DieEvent(4, EventType.ADVANTAGE),
                              DieEvent(5, EventType.ADVANTAGE, 2),
                              DieEvent(6, EventType.ADVANTAGE), DieEvent(7, EventType.ADVANTAGE),
                              DieEvent(8, EventType.NOTHING))

    val difficultyDie = EventDie(DieEvent(1, EventType.FAILURE, 2),
                                 DieEvent(2, EventType.FAILURE), DieEvent(2, EventType.THREAT),
                                 DieEvent(3, EventType.FAILURE), DieEvent(4, EventType.THREAT, 2),
                                 DieEvent(5, EventType.THREAT),  DieEvent(6, EventType.THREAT),
                                 DieEvent(7, EventType.THREAT),  DieEvent(8, EventType.NOTHING))
    /** D12 dice */
    val proficiencyDie = EventDie(DieEvent(1,  EventType.TRIUMPH),
                                  DieEvent(2,  EventType.SUCCESS),   DieEvent(3,  EventType.SUCCESS, 2),
                                  DieEvent(4,  EventType.SUCCESS),   DieEvent(5,  EventType.SUCCESS, 2),
                                  DieEvent(6,  EventType.SUCCESS),   DieEvent(6,  EventType.ADVANTAGE),
                                  DieEvent(7,  EventType.SUCCESS),   DieEvent(7,  EventType.ADVANTAGE),
                                  DieEvent(8,  EventType.SUCCESS),   DieEvent(8,  EventType.ADVANTAGE),
                                  DieEvent(9,  EventType.ADVANTAGE), DieEvent(10, EventType.ADVANTAGE, 2),
                                  DieEvent(11, EventType.ADVANTAGE, 2),
                                  DieEvent(12, EventType.NOTHING))

    val challengerDie = EventDie(DieEvent(1,  EventType.DESPAIR),
                                 DieEvent(2,  EventType.FAILURE), DieEvent(3, EventType.FAILURE, 2),
                                 DieEvent(4,  EventType.FAILURE), DieEvent(5, EventType.FAILURE, 2),
                                 DieEvent(6,  EventType.FAILURE), DieEvent(6, EventType.THREAT),
                                 DieEvent(7,  EventType.FAILURE), DieEvent(7, EventType.THREAT),
                                 DieEvent(8,  EventType.THREAT),  DieEvent(9, EventType.THREAT, 2),
                                 DieEvent(10, EventType.THREAT),  DieEvent(11, EventType.THREAT, 2),
                                 DieEvent(12, EventType.NOTHING))

    val forceDie = EventDie(DieEvent(1,  EventType.DARK),  DieEvent(2, EventType.DARK),
                            DieEvent(3,  EventType.DARK),  DieEvent(4, EventType.DARK),
                            DieEvent(5,  EventType.DARK),  DieEvent(6, EventType.DARK, 2),
                            DieEvent(7,  EventType.DARK),  DieEvent(8, EventType.LIGHT, 2),
                            DieEvent(9,  EventType.LIGHT), DieEvent(10, EventType.LIGHT, 2),
                            DieEvent(10, EventType.LIGHT), DieEvent(11, EventType.LIGHT, 2),
                            DieEvent(12, EventType.NOTHING))
}
