package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer= (int)(Math.random()*100.0)+1;//1~100

        int value;

        while(true){
            System.out.print("1~100사이 숫자를 입력해주세요>");
            value= scanner.nextInt();
            if(value>answer){
                System.out.println("down");
            }else if(value<answer){
                System.out.println("up");
            }else{
                System.out.println("정답!");
                System.out.println("answer:" +answer);
                break;
            }

    }
        scanner.close();
        }
}
