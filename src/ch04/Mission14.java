package ch04;

public class Mission14 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6) + 4;
        System.out.println("star: " + star);
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= star; j++) {
                if (j <= star - i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}