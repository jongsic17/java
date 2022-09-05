package 조건문;

import java.util.Scanner;

public class alarm_clock{
    public static void main(String[] args) {
        // 45분 일찍 알람 설정하기
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minute = input.nextInt();
        minute -= 45;

        if(minute < 0 ){
            minute += 60;
            hour -= 1;
        }
        if(hour < 0){
            hour += 24 ;
        }
        System.out.println(hour +" "+ minute);
    }
}
