package basic.day4;

//for문 복습 : 1) ~ 5) 까지 구현.  6) 구구단 출력하기(for in for)
public class A22ForReview {

    public static void main(String[] args) {

        int m;
        int n;
        int sum = 0; // 덧셈 결과를 저장할 변수
        int result = 1; // 곱셈 결과를 저장할 변수
        // 1) 1부터 정수 n 까지 더하기
        n = 10;
        for (int i = 1; i <= n; i++) {
            sum += i; // sum = sum+i
        }
        System.out.println(String.format("문제1) 1부터 %d 까지의 합계 : %d", n, sum));
        System.out.println("문제 1) 1부터 " + n + "까지의 합계 : " + sum);
        // 2) 1부터 정수 n 까지 곱하기
        n = 20; // int 타입은 정수 -2147483648 ~ +2147483647 그래서 곱셈결과 큰 값이 나올것을 예상하면
        long longResult = 10;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(String.format("문제1) 1부터 %d 까지의 합계 : %d", n, longResult));
        // 3) 시작값 정수 m 부터 마지막값 n 까지 더하기
        m = 5;
        n = 8;
        for (int i = 1; i <= n; i++) {
 
        }
        // 4) 시작값 정수 m 부터 마지막값 n 까지 곱하기
        m = 5; n = 8;
        longResult = 1; //초기화 꼭 필요.
        for (int i = 1; i <= n; i++) {
            longResult *= i;
        }
        System.out.println(String.format("문제4) %d 부터 %d 까지의 곱셈 : %,d", m,n,longResult));
        // 5) 2의 n승 구하기 : 2를 n번 곱하기 (2진수에서는 많이 사용되는 연산)
        n = 4;
        longResult = 1;
        for(int i = 1; i <= n; i++){
            longResult *= 2;
        }
        System.out.println(String.format("문제5) 2의 %d 승 구하기 : %,d", n, longResult));
    }
}
