package playtest;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int resident; // 주민수
        String[] residentRank = {"A", "B", "C"}; // 주민 계급 선언
        int[] candidate = new int[9]; // 후보자 선언
        int maxCandiate = 0;

        for(int i=0;i<candidate.length;i++){
            candidate[i] = 0; // 투표수 0으로 초기화
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("주민의 수를 입력하세요. : ");
        resident = sc.nextInt();
        for(int i = 0;i<resident;i++){
            String rank = sc.next();
            int num = sc.nextInt();
            if(rank.equals("A")){
                candidate[num] += 3;
            } else if(rank.equals("B")){
                candidate[num] += 2;
            } else if (rank.equals("C")) {
                candidate[num] += 1;
            } else{break;}
        }


        for(int i=0;i<candidate.length;i++){

            if(maxCandiate < candidate[i]){
                 maxCandiate = candidate[i];
            }
        }

        System.out.println("가장 높은 후보는 " + candidate[maxCandiate] + "번 후보");

    }

}
