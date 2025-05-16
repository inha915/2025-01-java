package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("합계를 구할 숫자를 입력하세요 (종료: 0)");

        while (true) {
            System.out.print(">> ");
            int value = scanner.nextInt();

            if (value == 0) {
                break;
            }

            sum += value;
        }

        System.out.println("합계: " + sum);
        scanner.close();
    }
}
