package 수학;

import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int max = 2;
        int min = 1000000;
        for (int i = 0; i < A.length ; i++){
            A[i] = sc.nextInt();
            if (A[i] > max){
                max = A[i];
            }
            if (A[i] < min){
                min = A[i];
            }
        }
        System.out.println(min*max);
    }
}
