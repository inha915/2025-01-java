package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------");

        int commaCnt = arr.length -1;
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
                System.out.print((i !=0 ? ", ":"")+arr[i]);
        }
        System.out.print("]");
    }
}