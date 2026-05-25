public class Loop {
    public static void main(String ar[]){
        int i=1;

        // while loop
        while(i<=4){
            System.out.println("Hi "+i);
            i++;
        }
        System.out.println("Bye "+i);

        // do while loop
        int j=5;
        do {
            System.out.println("Hi "+j);
            j++;
        }
        while(j<=4);

    }
}