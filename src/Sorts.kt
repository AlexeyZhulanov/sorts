class Sorts() {
    fun insertionSort(arr: IntArray): IntArray {
        for (i in 1..<arr.size) {
            val key = arr[i]
            var j = i - 1
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]
                j--
            }
            arr[j + 1] = key
        }
        return arr
    }

}