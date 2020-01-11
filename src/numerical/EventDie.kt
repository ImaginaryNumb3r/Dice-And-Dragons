package numerical

/**
 * A die which represents a set of events instead of a sequence of numbers.
 * (Face, EventType, Number)
 */
class EventDie<EventType>(private val eventDice: List<DieEvent<EventType>> = listOf()) {
    constructor(vararg events: DieEvent<EventType>): this(events.toList())
    val faces get() = eventDice.distinctBy { it.face }.count()
    val events get() = eventDice.map { it.eventType }.toSet()

    fun expectedValue(type: EventType): Double {
        val events= getEvents(type)
        val totalValue = events.map { it.value }.sum()

        return totalValue.toDouble() / faces
    }

    fun variance(type: EventType): Double {
        val mean = expectedValue(type)
        var dev = 0.0

        for (value in getEvents(type)) {
            val delta = value.value - mean
            dev += delta * delta
        }

        return dev / faces
    }

    private fun getEvents(type: EventType) = eventDice.filter { it.eventType == type }.toList()
}
