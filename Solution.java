
public class Solution {

    private static final int[][] NOT_POSSIBLE_TO_CREATE_2D_ARRAY = new int[][]{};

    public int[][] construct2DArray(int[] original, int rows, int columns) {
        if (rows * columns != original.length) {
            return NOT_POSSIBLE_TO_CREATE_2D_ARRAY;
        }

        int[][] originalTransformedTo2Dimensional = new int[rows][columns];

        for (int i = 0; i < original.length; ++i) {
            int row = i / columns;
            int column = i % columns;
            originalTransformedTo2Dimensional[row][column] = original[i];
        }

        return originalTransformedTo2Dimensional;
    }
}
