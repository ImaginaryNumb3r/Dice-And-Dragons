package numerical

data class DieEvent<EventType>(val face: Int, val eventType: EventType, val value: Int = 1)
