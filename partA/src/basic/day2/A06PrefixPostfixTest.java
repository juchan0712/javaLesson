package basic.day2;

public class A06PrefixPostfixTest {
    
    public static void main(String[] args) {
        int start =100;
        System.out.println("== postfix 확인 (출력 후에 -1)==");
		System.out.println(start--);		//출력 후에 -1
		System.out.println(start--);		//출력 후에 -1
		System.out.println(start--);		//출력 후에 -1
		System.out.println(start--);		//출력 후에 -1

		start = 100;
		System.out.println("== prefix 확인 (-1 후에 출력) ==");
		System.out.println(--start);		// -1 후에 출력
		System.out.println(--start);		// -1 후에 출력
		System.out.println(--start);		// -1 후에 출력
		System.out.println(--start);		// -1 후에 출력
		    
    }
}
