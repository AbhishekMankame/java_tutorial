public class JaggedArray {
    public static void main(String a[]){
        int nums[][] = new int[3][]; // Jagged array

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2]; 

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Print using jagged array: ");

        for(int n[]:nums){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}

/*
## Jagged Array:
A jagged array in Java is a type of multidimensional arry where each row can have a different number of columns.
Unlike a regular 2D array, which has a fixed rectangular structure, a jagged array allows rows to vary in size, making it more flexible.
In Java, a jagged array is essentially an "array of arrays", where each inner array is created seperately and can have its own length.

Note: Jagged arrays are useful when data is not uniform, such as storing marks of students where each student has a different number of subjects or representing adjacency lists in graphs.

*/