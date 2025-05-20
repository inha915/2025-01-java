package ch05.sec06;

import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args) {
        int[] arr = new int[5];


        for(int i =0; i< arr.length; i++){
            arr[i] = (i+1)*100;
        }

//        arr1[0]= 100;
//        arr1[1]= 200;
//        arr1[2]= 300;
//        arr1[3]= 400;
//        arr1[4]= 500;

//        int num =arr1[0];
        System.out.println(Arrays.toString(arr));
        //[100, 200, 300, 400, 500]
//        System.out.printf("[%d, %d, %d, %d, %d]",arr1[0],arr1[1],arr1[2],arr1[3],arr1[4]);
    }
}
