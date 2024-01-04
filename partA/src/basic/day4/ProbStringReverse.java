package basic.day4;

public class ProbStringReverse {

    // message 문자열이 "Hello World" 일 때 문자열을 뒤집기
    // char[] 배열 사용해서 도전 !!!

    public static void main(String[] args) {

        System.out.println("Hello World 배열");
        System.out.println("----------------");
        String message = "Hello World";

        char[] messageArray = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            char temp = message.charAt(i);
            System.out.println(temp);
            messageArray[i] = temp;
        }
        System.out.println("----------------");

        System.out.println("메세지 원문 : ");
        System.out.println(messageArray);

        System.out.println("----------------");

        System.out.println("뒤집은 문자열 : ");

        for (int i = 10; i >= 0; i--) {
            char temp1 = message.charAt(i);
            System.out.println(temp1);
            messageArray[i] = temp1;
        }

    }
}
