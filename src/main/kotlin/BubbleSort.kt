object BubbleSort {

    fun sort(elements: MutableList<Int>) {
        for (i in elements.size - 1 downTo 1) {
            for (j in 0..i) {
                if (j < i && elements[j] > elements[j + 1]) {
                    val temp = elements[j]
                    elements[j] = elements[j + 1]
                    elements[j + 1] = temp
                }
            }
        }
    }
}