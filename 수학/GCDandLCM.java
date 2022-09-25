package 수학;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {

        // 최대 공약수 최소 공배수 출력
        int min = 0; // 6
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i=1;i<=10000; i++){
            if (num1 % i == 0 && num2 % i == 0){
                min = i;  //마지막에 제일 큰값 들어감
            }
        }
        System.out.println(min);  // 최소공약수
        System.out.println(min * num1/min * num2/min);  // 최소공배수
    }
}
