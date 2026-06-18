class Array2D {
    public static void main(String a[]) {
        int nums[][] = new int[3][4];

        int n = nums.length;
        int m = nums[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        int random = (int)(Math.random()*100);
        System.out.println("Random value generated using Math.random(): " + random);

        // Assigning random values to the 2D array
        System.out.println();
        System.out.println("Let's assign some random values to the elements of the array");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j] = (int)(Math.random()*100);
            }
        }

        // Let's print the array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Enhanced for loop
        for(int n1[]:nums){
            for(int m1:n1){
                System.out.print(m1 + " ");
            }
            System.out.println();
        }
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