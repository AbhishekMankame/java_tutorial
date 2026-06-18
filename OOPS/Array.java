class Array {

    public static void main(String a[]) {
        int nums[] = {3,7,2,4};
        System.out.println("First element of array: " + nums[0]); // prints element at index 0
        System.out.println("Second element of array: " + nums[1]);

        // Updating the value
        nums[1] = 8;
        System.out.println("Second element of array: " + nums[1]);

        // Dynamic allocation of array
        int nums2[] = new int[4]; // By default all the values of this array will be zero (0)

        // Traversing all the element of the array
        System.out.println();
        System.out.println("Let's traverse the array");
        
        // int n = sizeof(nums)/sizeof(nums[0]); --> This one does not exist in java, it is present in C/C++
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}