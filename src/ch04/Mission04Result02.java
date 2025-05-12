package ch04;

import java.util.Scanner;

public class Mission04Result02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요: ");
        int score = scan.nextInt();
        System.out.printf("score: %d\n ", score);

        String result="D학점";
        if(score < 0 || score > 100){
           result="측정불가";
        }else if(score>=90) {
            result="A학점";
        }else if(score>=80) {
            result="B학점";
        }else if(score>=70) {
            result="C학점";
        }
        System.out.printf("당신의 %s학점", result);
        System.out.printf("-- 끝 --");

    }
}
