package ch05.sec06;

public class Mission08 {
    public static void main(String[] args) {
        int[] arr={77, 34, 109, 200, 21, 101, 48};

        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("min: " + min);
        //arr 배열에서 가장 작은 값 찾아서 출력
    }
}
