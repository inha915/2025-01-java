package ch04.sec03;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요.(w/m)>");
        String gender=scanner.next();
        System.out.println("gender: "+gender);
        if("w".equalsIgnoreCase(gender)){
            System.out.println("당신은 여자입니다.");
        }else if("m".equalsIgnoreCase(gender)) {
            System.out.println("당신은 남자입니다.");
        }else{
            System.out.println("성별을 입력해주세요");
        }
    }
}
