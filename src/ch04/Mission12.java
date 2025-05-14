package ch04;

public class Mission12 {
    public static void main(String[] args) {
        for (int dan = 1; dan < 10; dan++ ) {
            System.out.println();

            for(int i=2; i<10; i++ )
                System.out.printf("%d x %d = %d\t", i, dan, dan * i);
        }
    }
}
