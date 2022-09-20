package Section_2_실습;

public class Recursion {

//    public int arrSum(int[] arr) {
//        //Base Case : 문제를 더 이상 쪼갤 수 없는 경우 (재귀의 기초)
//        if (arr.length == 0) {
//            return 0;
//        }
//        /*
//         * Recursive Case : 그렇지 않은 경우
//         * 문제를 더 이상 쪼갤 수 없는 경우
//         * head: 배열의 첫 요소
//         * tail: 배열의 첫 요소만 제거된 배열
//         */
//        return head + arrSum(tail);
//    }

//    public type recursive(input1, input2, ...) {
        // Base Case : 문제를 더 이상 쪼갤 수 없는 경우
//        if (문제를 더 이상 쪼갤 수 없을 경우) {
//            return 단순한 문제의 해답;
//        }
        // recursive Case
        // 그렇지 않은 경우
//        return 더 작은 문제로 새롭게 정의된 문제
        // 예1. someValue + recursive(input1Changed, input2Changed, ...)
        // 예2. someValue * recursive(input1Changed, input2Changed, ...)
//    }

    // 예제 - 구구단

    // 반복문으로 구현한 구구단 메서드
    public void Gugudan(int level){
        for(int count = 0; count < 9; count++) {
            System.out.printf("%d x %d = %d\n", level, count, level * count);
        }
    }

    // 재귀 호출로 구현한 구구단 메서드
    public void Gugudan(int level, int count) {
        if(count > 9) {
            return;
        }
        System.out.printf("%d x %d = %d\n", level, count, level*count);
        Gugudan(level, ++count);
    }

    // 에제 - factorial
    // 반복문으로 구현한 팩토리얼 메서드
    public int Factorialf(int number) {
        int result = 1;
        for(int count = number; count > 0; count--) {
            result = result * count;
    }
    return result;
}

    // 재귀 호출로 구현한 팩토리얼 메서드
    public int Factorial(int number) {
        if(number <= 1) {
            return 1;
        }
        return number * Factorial(number - 1);
    }

    public static void main(String[] args) {
        // 하노이 탑과 조합 문제

        // 뭐지?
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                for(int k = 0; k < n; k++) {
//                    for(int l = 0; l < n; l++) {
//                        for(int m = 0; m < n; m++) {
//                            // do something
//                            someFunc(i, j, k, l, m);
//                        }
//                    }
//                }
//            }
//        }

        Recursion a = new Recursion();
//        a.Gugudan(5);
        System.out.println(a.Factorialf(10));
        System.out.println(a.Factorial(10));
    }
}
