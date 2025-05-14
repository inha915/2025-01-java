package ch04;

public class Mission10 {
    public static void main(String[] args) {
        for (int dan = 2; dan < 10; dan++ ) {
            System.out.println();
            System.out.println(dan+"단");
            for(int i=1; i<10; i++ )
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }
}