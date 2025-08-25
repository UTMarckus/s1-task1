package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var resArr = sadArray
        var isHappy = false

        do {
            val startArray = resArr
            resArr = intArrayOf()
            isHappy = true

            startArray.forEachIndexed { index, i ->
                when {
                    index == 0 || index == startArray.lastIndex -> resArr += i
                    startArray[index - 1] + startArray[index + 1] > i -> resArr += i
                    else -> isHappy = false
                }
            }

        } while (!isHappy)

        return resArr
    }
}

fun main() {
    val sadArray = intArrayOf(1, 5, 2, 7, 93, 8, 9, 3)
    println(HappyArray().convertToHappy(sadArray).joinToString())
}
