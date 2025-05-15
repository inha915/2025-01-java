package ch04.sec03;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요.(w/m)>");
        String gender=scanner.next();
        System.out.println("gender: "+gender);
        switch(gender) {
            case "w", "W":
                System.out.println("여자입니다");
                break;
            case "m", "M":
                System.out.println("남자입니다");
                break;
            default:
                System.out.println("값을 찾을수 없습니다");
        }
        scanner.close();
    }
}
