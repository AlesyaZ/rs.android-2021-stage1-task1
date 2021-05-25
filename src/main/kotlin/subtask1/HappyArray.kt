package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size < 3)
            return sadArray

        val changeToHappy = sadArray.toCollection(ArrayList())
        var i = 1
        while (i < changeToHappy.size - 1) {
            if (changeToHappy[i] <= changeToHappy[i - 1] + changeToHappy[i + 1]){
                i++
            } else if (changeToHappy[i] > changeToHappy[i - 1] + changeToHappy[i + 1] && i != 1) {
                changeToHappy.removeAt(i)
                i--
            } else {  // i = 1
                changeToHappy.removeAt(i)
                i++
            }
        }
        return changeToHappy.toIntArray()
    }
}
