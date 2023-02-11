package symbolic

/**
 * A die which represents a set of symbols instead of a sequence of numbers.
 * (Face, SymbolType, Number)
 */
class SymbolicDie<SymbolType>(private val symbolicDice: List<DieSymbol<SymbolType>> = listOf()) {
    constructor(vararg events: DieSymbol<SymbolType>): this(events.toList())
    val faceCount get() = symbolicDice.distinctBy { it.face }.count()
    val symbolSet get() = symbolicDice.map { it.symbol }.toSet()

    fun expectedValue(type: SymbolType): Double {
        val events= getEvents(type)
        val totalValue = events.map { it.value }.sum()

        return totalValue.toDouble() / faceCount
    }

    fun variance(type: SymbolType): Double {
        val mean = expectedValue(type)
        var dev = 0.0

        for (value in getEvents(type)) {
            val delta = value.value - mean
            dev += delta * delta
        }

        return dev / faceCount
    }

    fun getFace(index: Int): SymbolicDieFace<SymbolType> {
        val faces = symbolicDice.filter { it.face == index }.toList()
        return SymbolicDieFace(faces)
    }

    fun randomFace(): SymbolicDieFace<SymbolType> {
        val randomFace = (1..faceCount).random()
        return getFace(randomFace)
    }

    private fun getEvents(type: SymbolType) = symbolicDice.filter { it.symbol == type }.toList()
}
