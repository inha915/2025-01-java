package ch04;

public class Mission09 {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; // 2~9 사이 랜덤값
        System.out.println("dan: " + dan);
        for (int i = 1; i < 10; i++ ) {
            int res = dan * i;
            System.out.printf("%d x %d = %d\n", dan, i, res);
        }
    }
}
