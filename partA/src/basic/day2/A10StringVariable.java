package basic.day2;

public class A10StringVariable {

    public static void main(String[] args) {
        // String 은 문자열 : 문자(' ')의 집합. 문자열 리터럴은 기호 "" 사용합니다.
        String message = "Hello~ 안녕!! 하이하이";

        System.out.println(message);
        System.out.println("메세지'" + message + "'의 길이 : " + message.length()); // () 가 나오면 함수 또는 메소드

        message = "welcome~ java world!!!!";
        System.out.println("메세지'" + message + "'의 길이 : " + message.length());

        // String으로 선언된 변수는 `객체`입니다.
        // 그래서 메소드를 갖고 필요한 기능들을 제공해 줍니다. -> "length()"

        // char imo = '😀'; //char은 2바이트 이모지는 4바이트. 문자형으로 저장 안됨.
        String emo = "😄"; // 이모지는 문자열로 저장해야 합니다.
        System.out.println(emo);

        // 자바 String의 중요한 메소드 7가지씩 조사해서 테스트 해보기

        // 여기서 중요한 것은 a==c가 true인 것이다.
        // 이유는 java에서 로컬함수 내에 같은 문자열이 나오면 공유상수 pool에서 관리하기 때문에 새로운 메모리를 할당하지 않고 원래 있던
        // 주소로 배정해주기 때문이다.
        // 1. equals()
        String a = "banana";
        String b = a;
        String c = "banana";
        String d = new String("banana");
        String e = "coconut";

        System.out.println(a == b); // true
        System.out.println(a.equals(b)); // true

        System.out.println(a == c); // true
        System.out.println(a.equals(c)); // true

        System.out.println(b == c); // true
        System.out.println(b.equals(c)); // true

        System.out.println(a == d); // false
        System.out.println(a.equals(d)); // true

        System.out.println(a == e); // false
        System.out.println(a.equals(e)); // false

        // 2. indexOf()
        // 문자열에서 특정 문자가 시작되는 인덱스를 리턴한다.
        String str1 = "문자열을 공부해보자";
        String str2 = "abcedf";

        System.out.println(str1.indexOf("공부")); // 5
        System.out.println(str2.indexOf("b")); // 1

        // 3. length()
        // 문자열의 길이를 반환한다.
        String str = "abcdef";
        int length = str.length();
        System.out.println("length : " + length); // 6

        // 4. substring()
        // 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
        // 사용방법은 2가지로 매개변수에 1개를 입력할 경우 시작지점으로 인식하여 시작지점부터 해당 문자열의 끝까지 출력하고, 매개변수에 2개를
        // 입력할 경우 시작지점과 끝지점으로 인식하여 출력된다.
        // 여기서 subString(5,8)을 사용했을 때, 인덱스 5,6,7에 해당하는 문자열만 출력되는 것에 유의하자 !!

        String str3 = "ABCDEF";
        String subString = str3.substring(0, 2);
        System.out.println("substring: " + subString); // substring: AB

        // 5. concat()
        // 문자열과 문자열을 이어주고자 할 때 사용한다.
        // 사실 java에서는 문자열 + 문자열을 해주기만 해도 사용 가능한데 이 기능이 특별히 사용되는 시점을 공부해야 될 듯 하다.

        String str4 = "안녕 ! ";
        String str5 = "나는 주찬이야.";
        String concat = str4.concat(str5);
        System.out.println(concat); // 안녕 ! 나는 주찬이야.

        // 6. startsWith()
        // 문자열이 지정한 문자로 시작하는지 체크하여 맞을 경우 true를 맞지 않을 경우 false를 반환한다.
        // 여기서 대소문자를 구별한다는 것에 주의하자 !!

        String str6 = "강주찬";
        String str7 = "abcde";

        System.out.println(str6.startsWith("강"));  //true
        System.out.println(str6.startsWith("주"));  //false
        System.out.println(str7.startsWith("A"));   //false

        //7. endWith()
        //문자열의 마지막에 지정한 문자가 있는지 체크하여 있다면 true를 없다면 false를 반환한다.  
        //여기서도 대소문자를 구별한다 !!!!

        String s = "I have a book";
        System.out.println(s.endsWith("book")); //true
        System.out.println(s.endsWith("a"));    

    }
}
