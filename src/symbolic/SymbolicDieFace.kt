package symbolic

class SymbolicDieFace<SymbolType>(val dieSymbols: List<DieSymbol<SymbolType>>) {

    fun toMap(): Map<SymbolType, Int> {
        val map = mutableMapOf<SymbolType, Int>()
        for (dieSymbol in dieSymbols) {
            map.putIfAbsent(dieSymbol.symbol, dieSymbol.value)
            map.computeIfPresent(dieSymbol.symbol) { _, value -> value + dieSymbol.value }
        }

        return map
    }

}