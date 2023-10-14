package ch4;

public class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int realsum = 0;
        for(int i =1;i<=10;i++){
            sum = sum + i;
            for(int j=0;j<i;j++){
                realsum += sum;
            }
        }

        System.out.println("realsum = " + realsum);
    }
}
