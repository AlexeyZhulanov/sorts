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

    fun quickSort(arr: IntArray): IntArray {
        if (arr.size < 2) return arr
        val pivot = arr[arr.size / 2]
        val less = arr.filter { it < pivot }.toIntArray()
        val equal = arr.filter { it == pivot }.toIntArray()
        val greater = arr.filter { it > pivot }.toIntArray()
        return quickSort(less) + equal + quickSort(greater)
    }

    fun bubbleSort(arr: IntArray): IntArray {
        val n = arr.size
        for (i in 0..<n) {
            for (j in 0..<n - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
        return arr
    }

}