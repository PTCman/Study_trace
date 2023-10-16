package ch4;

public class Exercise4_12 {
    public static void main(String[] args) {
        for(int j=1;j<=3;j++) {
            for (int i = 2; i <= 9; i++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                if(i%3==1){
                    System.out.println();

                }
            }
        }
    }
}
