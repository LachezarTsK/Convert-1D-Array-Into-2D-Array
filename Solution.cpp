
#include <vector>
using namespace std;

class Solution {

    inline static const vector<vector<int>> NOT_POSSIBLE_TO_CREATE_2D_ARRAY;

public:
    vector<vector<int>> construct2DArray(const vector<int>& original, int rows, int columns) const {
        if (rows * columns != original.size()) {
            return NOT_POSSIBLE_TO_CREATE_2D_ARRAY;
        }

        vector<vector<int>> originalTransformedTo2Dimensional(rows, vector<int>(columns));

        for (size_t i = 0; i < original.size(); ++i) {
            size_t row = i / columns;
            size_t column = i % columns;
            originalTransformedTo2Dimensional[row][column] = original[i];
        }

        return originalTransformedTo2Dimensional;
    }
};
