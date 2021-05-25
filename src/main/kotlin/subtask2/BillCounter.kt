package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val totalAmount = bill.sum() - bill[k]
        val payAnna = totalAmount / 2
        val billReturn = b - payAnna
        return if (payAnna == b) {
            "Bon Appetit"
        } else {
            billReturn.toString()
        }
    }
}
