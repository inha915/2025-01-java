package ch04.sec03;

public class Mission02 {
    public static void main(String[] args) {
        int score = (int)(Math.random()*101.0);

System.out.println(score);

        if (score > 100) {
            System.out.println("잘못된점수입니다");
        }else if (score >= 98) {
            System.out.println("A+");
        }else if (score >= 94) {
            System.out.println("A0");
        }else if (score >= 90) {
            System.out.println("A-");
        } else if (score >= 88) {
            System.out.println("A+");
        }else if (score >= 84) {
            System.out.println("B0");
        }else if (score >= 80) {
            System.out.println("B-");
        }else if (score >= 78) {
            System.out.println("C+");
        }else if (score >= 74) {
            System.out.println("C0");
        }else if (score >= 70) {
            System.out.println("C-");
        }
        System.out.println("--끝--");
    }
}
