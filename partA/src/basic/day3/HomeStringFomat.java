package basic.day3;

//String.format() 에 대한 예제를 작성하고 실행도 해보세요.

public class HomeStringFomat {
    
    public static void main(String[] args) {
        
        
        //String.format() 메서드 - Java에서 숫자를 0으로, 혹은 문자열을 공백으로 채우는 방법
        //0으로 채우거나 공백으로 채우는 것은, 숫자나 문자 라인을 지정의 자리수가 되도록 패딩(padding)하는 것이다.
        //예를 들면, 총 자리수 5자리에 “123"이라고 하는 수가 있다면, 앞에 나머지 2자리를 0으로 채우면 “00123"이 된다.

        System.out.println("0으로 채우기");
        System.out.println(String.format("%03d", 123));     //123
        System.out.println(String.format("%04d", 123));     //0123
        System.out.println(String.format("%05d", 123));     //00123

        System.out.println("공백으로 채우기");
        System.out.println(String.format("%3s", "ABC"));    //ABC
        System.out.println(String.format("%4s", "ABC"));    // ABC
        System.out.println(String.format("%5s", "ABC"));    //  ABC
    }
        

}
