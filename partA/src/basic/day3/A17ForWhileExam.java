package basic.day3;

public class A17ForWhileExam {

    public static void main(String[] args) {
        // 반복문 for가 활용되는 예시

        String message = "Hello, World~ Hoi";
        int count = 0;
        System.out.println("1.문자열 길이 만큼 문자 1개를 추출하는 반복문 실행하기");
        for (int i = 0; i < message.length(); i++) { // i = 0 초기화, i < 문자열길이 조건식; 반복할때마다 i++ (주의) i는 for안에서만 사용합니다.
            char temp = message.charAt(i);
            System.out.println("i=" + i + ", 문자=" + temp);
            if (temp == 'o') {
                count++;
            }
            
        } // for
        System.out.println("o의 갯수는 : " + count);
        // 위의 for문을 while문으로 바꿔서 실행해보세요.
        System.out.println();
        int k = 0;
        while (k < message.length()) {
            char temp = message.charAt(k);
            System.out.println("k=" + k++ + ", 문자=" + temp);
        } // while

    } // main

} // class
