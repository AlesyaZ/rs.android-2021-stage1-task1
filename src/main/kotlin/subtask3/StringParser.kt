package subtask3

class StringParser {
    fun getResult(inputString: String): Array<String> {
        var resultStringParser = mutableListOf<String>()
        val changeInputString = StringBuilder(inputString)
        val bracketsOpen = arrayOf('[','<','(')
        val bracketsClose = arrayOf(']','>',')')
        var count = 0

        for (i in inputString.lastIndex downTo 1) {
            if (inputString[i] in bracketsOpen) {
                for (ind in i..inputString.lastIndex) {
                    if (changeInputString[ind] in bracketsClose &&
                        bracketsOpen.indexOf(inputString[i]) == bracketsClose.indexOf(inputString[ind])) {
                        count = ind
                        changeInputString[ind] = ' '
                        break
                    }
                }
                resultStringParser.add(0, inputString.substring(i + 1, count))
            }
        }
        return resultStringParser.toTypedArray()
    }
}
