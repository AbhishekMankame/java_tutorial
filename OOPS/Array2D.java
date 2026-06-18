class Array2D {
    public static void main(String a[]) {
        int nums[][] = new int[3][4];
    }
}



/*
Note: In 2-D array (2 dimension array) we can skip dimensions only from left to right
- For a multidimensional array, you must specify dimensions in order from the first dimension onward.
- First dimension is mandatory. Any dimension after it can be omitted.

new int[5][3]; // ✅ first and second dimensions given
new int[5][]; // ✅ first given, second omitted
new int[][3]; // ❌ first omitted, second given
new int[][]; // ❌ no dimensions given

Note:
int[][] nums;
- First dimension = number of rows -> must be known when creating the array
- Second dimension = size of each row -> can be decided later


### For 3D Array

new int[2][3][4]; // ✅
new int[2][3][]; // ✅
new int[2][][]; // ✅

new int[][3][4]; // ❌
new int[2][][4]; // ❌

Notice: Once you omit a dimension('[]'), all dimensions to its right must also be omitted.

*/