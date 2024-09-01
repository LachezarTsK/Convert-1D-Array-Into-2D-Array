
package main

import "fmt"

var NOT_POSSIBLE_TO_CREATE_2D_ARRAY [][]int = [][]int{}

func construct2DArray(original []int, rows int, columns int) [][]int {
    if rows * columns != len(original) {
        return NOT_POSSIBLE_TO_CREATE_2D_ARRAY
    }

    originalTransformedTo2Dimensional := make([][]int, rows)
    for r := 0; r < rows; r++ {
        originalTransformedTo2Dimensional[r] = make([]int, columns)
    }

    for i := range original {
        row := i / columns
        column := i % columns
        originalTransformedTo2Dimensional[row][column] = original[i]
    }

    return originalTransformedTo2Dimensional
}
