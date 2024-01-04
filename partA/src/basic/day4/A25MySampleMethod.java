package basic.day4;

public class A25MySampleMethod {
    // A25 소스파일은 구글드라이브에 올려주세요.
    // A22번 1 ~ 5 을 각각 메소드로 정의해 보기 - 메소드 안에서 출력문 만들지 않습니다.
    // 1) sumToN 2) Multiply1ToN 3) sumMToN 4) multiplyMToN 5) multiplyNof2
    // 6) 구구단 '출력' 하는 메소드. 리턴은 void, printGugudan
    public static void main(String[] args) {
        int result = addMToN(2,5);
        boolean isOk = checkJumsu(67);
       
        printGugudan(); 
    }

    private static boolean checkJumsu(int i){
        return i>=0 && i<=100;
    }
    private static int addMToN(int i, int j){
        int sum = 0;
        for(int k=i; k<=j; k++){
            sum += k;
        }
        return 0;
    }

    // 1) 1부터 정수 n 까지 더하기
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 2) 1부터 정수 n 까지 곱하기
    public static int MultiplyMToN(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 3) 시작값 정수 m 부터 마지막값 n 까지 더하기
    public static int sumMToN(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 4) 시작값 정수 m 부터 마지막값 n 까지 곱하기
    public static long multiplyMToN(int m, int n) {
        long result = 1;
        for (int i = m; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5) 2의 n승 구하기 : 2를 n번 곱하기 (2진수에서는 많이 사용되는 연산)
    public static long multiplyNof2(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= 2;
        }
        return result;
    }

    public static void printGugudan() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(String.format("%3d x %3d = %3d", i, j, i * j));
            }
        }
    }
}
