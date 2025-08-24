package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String =
        bill.filterIndexed { index, i -> index != k }.sum().let { if (it / 2 == b) "Bon Appetit" else "${b - it / 2}" }
}
