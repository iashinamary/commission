import kotlin.math.round

fun main() {
    val amount1 = 30_000
    val amount2 = 1000
    val percentOfCommission = 100 * 0.75

    var commission1 = Math.round(amount1 / percentOfCommission)
    if (commission1 < 35) {
        commission1 = 35
    }

    var commission2 = Math.round(amount2 / percentOfCommission)
    if (commission2 < 35) {
        commission2 = 35
    }

    println(commission1)
    println(commission2)
}