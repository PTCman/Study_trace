package playtest;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int record = a; // a 저장소
        int cnt = 0;

        while (true) {
            cnt++;
            int x1 = a / 10; //a = xy
            int y1 = a % 10;
            int b = x1 + y1;
            int c = y1 * 10 + b % 10;
            a = c;
            if (record == a) {
                System.out.println(cnt + "번의 자르기 과정이 있었다.");
                break;
            }

        }


    }
}
