package ch02;

public class PrintVsPrintln {
    public static void main(String[]args){
        //print
        System.out.print("안녕");
        System.out.print("안녕");
        System.out.print("안녕");

        System.out.println();
        System.out.println("-----------------");

        //println
        System.out.print("안녕\\n");
        System.out.print(" '안녕'\n");
        System.out.print(" \"안녕\"\n");

        //printf
        int age =22;
        String name="홍길동";
        float height = 172.5f;
        // age, name, height 변수를 활용하여 아래처럼 출력시켜주세요
        // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5입니다.
        System.out.println("제 이름은 "+name+"이고 나이는 "+age+"살이며 키는 "+height+"cm입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm입니다.\n", name, age, height);
    }
}
