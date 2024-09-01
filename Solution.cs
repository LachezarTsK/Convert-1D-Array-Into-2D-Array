
using System;

public class Solution
{
    private static readonly int[][] NOT_POSSIBLE_TO_CREATE_2D_ARRAY = { };

    public int[][] Construct2DArray(int[] original, int rows, int columns)
    {
        if (rows * columns != original.Length)
        {
            return NOT_POSSIBLE_TO_CREATE_2D_ARRAY;
        }

        int[][] originalTransformedTo2Dimensional = new int[rows][];

        for (int i = 0; i < original.Length; ++i)
        {
            int row = i / columns;
            int column = i % columns;

            if (column == 0)
            {
                originalTransformedTo2Dimensional[row] = new int[columns];
            }

            originalTransformedTo2Dimensional[row][column] = original[i];
        }

        return originalTransformedTo2Dimensional;
    }
}
