import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortingTests {

    private val sorts = Sorts()

    @Test
    fun testInsertionSort() {
        val input = intArrayOf(5, 2, 9, 1, 5, 6)
        val expected = intArrayOf(1, 2, 5, 5, 6, 9)
        assertArrayEquals(expected, sorts.insertionSort(input))
    }

    @Test
    fun testQuickSort() {
        val input = intArrayOf(5, 2, 9, 1, 5, 6)
        val expected = intArrayOf(1, 2, 5, 5, 6, 9)
        assertArrayEquals(expected, sorts.quickSort(input))
    }

    @Test
    fun testSortingWithNegativeNumbers() {
        val input = intArrayOf(-3, -1, -4, 2, 0, 1)
        val expected = intArrayOf(-4, -3, -1, 0, 1, 2)
        assertArrayEquals(expected, sorts.insertionSort(input))
        assertArrayEquals(expected, sorts.quickSort(input))
    }

    @Test
    fun testSortingAlreadySortedArray() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        assertArrayEquals(input, sorts.insertionSort(input.clone()))
        assertArrayEquals(input, sorts.quickSort(input.clone()))
    }
}
