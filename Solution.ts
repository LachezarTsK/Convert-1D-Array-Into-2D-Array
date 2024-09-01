
function construct2DArray(original: number[], rows: number, columns: number): number[][] {
    const NOT_POSSIBLE_TO_CREATE_2D_ARRAY: number[][] = new Array();

    if (rows * columns !== original.length) {
        return NOT_POSSIBLE_TO_CREATE_2D_ARRAY;
    }

    const originalTransformedTo2Dimensional: number[][] = Array.from(new Array(rows), () => new Array(columns));

    for (let i = 0; i < original.length; ++i) {
        let row = Math.floor(i / columns);
        let column = i % columns;
        originalTransformedTo2Dimensional[row][column] = original[i];
    }

    return originalTransformedTo2Dimensional;
};
