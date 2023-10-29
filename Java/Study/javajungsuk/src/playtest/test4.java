package playtest;

import java.util.Scanner;

public class test4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();

        Record[] r = new Record[size];
        for(int i = 0;i<k;i++){
        }
    }
}

class Record{
    int x;
    int y;
    int index;
    Record(){
        this.x = 0;
        this.y = 0;
        this.index = 0;
    }
}