class Computer {
    public void playMusic(){
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {

        if(cost >= 10)
            return "Pen";
        else return "Nothing";
    }
}

public class Demo2 {
    public static void main(String a[]){
        Computer com = new Computer(); // Note: Here 'com' is a reference variable
        com.playMusic();
        String str = com.getMeAPen(12);
        System.out.println(str);
    }
}