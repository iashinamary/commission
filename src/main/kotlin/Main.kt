import kotlin.math.round

fun main() {
    val amount = 1000
    val percentOfCommission = 100 * 0.0075

    var commission = (amount / percentOfCommission).toInt()
    if (commission < 35) {
        commission = 35
    }

    println(commission)
}