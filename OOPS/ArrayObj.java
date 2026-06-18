class Student {
    int rollNo;
    String name;
    int marks;
}

class ArrayObj {
    public static void main(String a[]) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Harsh";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Kiran";
        s3.marks = 97;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(s1);
        System.out.println(s1.name + " " + s1.rollNo + " " + s1.marks);

        System.out.println(s2);
        System.out.println(s2.name + " " + s2.rollNo + " " + s2.marks);

        System.out.println(s3);
        System.out.println(s3.name + " " + s3.rollNo + " " + s3.marks);

        System.out.println();
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " " + students[i].rollNo + " " + students[i].marks);
        }
        
        // Using enhanced for loop
        System.out.println();
        for(Student stud: students){
            System.out.println(stud.name + " : " + stud.rollNo + " : " + stud.marks);
        }

        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i=0;i<nums.length;i++) {
        //     System.out.print(nums[i]+" ");
        // }
        // System.out.println();
        
    }
}