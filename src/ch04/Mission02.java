package ch04;

public class Mission02 {
    public static void main(String[] args) {
        // API, Math.random() double 타입 리턴, 0.000000 ~ 0.9999999, 절대 1이 안나온다.

        //
        int rValue=((int)(Math.random()*22)+13);
        System.out.println(rValue);
    }
}
