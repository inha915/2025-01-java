package ch04;

public class Mission03 {
    public static void main(String[] args) {
        int value =(int)(Math.random()*100.0)+1;  //1~100사이의 랜덤값 나오게 해주시고

       String oddEven = "홀";
       if(value % 2 ==0){
           oddEven ="짝";
       }
       System.out.printf("%d는(은) %s수입니다.\n", value, oddEven);
        //value =5; 라면
        //출력: 5는(은) 홀수입니다.

        //랜덤값이 value = 97; 라면
        //출력: 97는(은) 홀수입니다.

        //랜덤값이 value = 54; 라면
        //출력: 54는(은) 홀수입니다.
    }
}
