
class Solution {

    private companion object {
        val NOT_POSSIBLE_TO_CREATE_2D_ARRAY = Array<IntArray>(0) { IntArray(0) }
    }

    fun construct2DArray(original: IntArray, rows: Int, columns: Int): Array<IntArray> {
        if (rows * columns != original.size) {
            return NOT_POSSIBLE_TO_CREATE_2D_ARRAY
        }

        val originalTransformedTo2Dimensional = Array<IntArray>(rows) { IntArray(columns) }

        for (i in original.indices) {
            val row = i / columns
            val column = i % columns
            originalTransformedTo2Dimensional[row][column] = original[i]
        }

        return originalTransformedTo2Dimensional
    }
}
