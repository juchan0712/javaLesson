package basic.day3;

public class A16MaxMinValue {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;
        int min;
        int max;
        // 1) 조건식이 참/거짓 각각 실행명령어가 다릅니다.
        if (n1 < n2) {
            min = n1;
            max = n2;
        } else {
            min = n1;
            max = n2;
        }
        // 2) 조건식이 참일 때만 실행하는 명령어가 있습니다.
        // 참 또는 거짓일 때 실행하는 명령문이 1개 이면 { } 생략하고 할 수 있습니다.
        if (min > n3)
            min = n3;
        if (max < n3)
            max = n3;

        System.out.println("n1=" + n1 + ",n2=" + n2 + ",n3=" + n3);
        System.out.println("최소값 min=" + min);
        System.out.println("최대값 max=" + max);

    }
}
