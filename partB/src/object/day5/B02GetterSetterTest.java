package object.day5;

public class B02GetterSetterTest {

    public static void main(String[] args) {
        MyClass2 momo = new MyClass2();
        System.out.println("MyClass2 의 field1 값(초기) : " + momo.getField1());
        momo.setField1("나는 모모!!");
        System.out.println("MyClass2 의 field1 값(변경후) : " + momo.getField1());
        String message = "WELCOME~!";
        momo.setField1("나는 나연");
        System.out.println("MyClass2 의 field1 값(변경후) : " + momo.getField1());
        String message1 = "나연";
        momo.setField1(message1);
        System.out.println("MyClass2 의 field1 값(변경후) : " + momo.getField1());

        System.out.println("\nMyClass2 의 field2 값(초기) : " + momo.getField2());
        momo.setField2(900);
        System.out.println("MyClass2 의 field2 값(변경후) : " + momo.getField2());
        System.out.println("\n 지금까지 momo 객체 값들은 .... ");
        momo.printData();

        int test = 1212;
        momo.setField2(test);
        System.out.println("MyClass2 의 field2 값(변경후) : " + momo.getField2());
        momo.printData();

        System.out.println("~~~~~field3은 double배열 타입 입니다.");
        double[] dArray = momo.getField3();
        System.out.println("field3 : " + dArray);
        System.out.println("field3 : " + momo.getField3());

        double[] tempArray = { 1.2, 3.44, 67.12 };
        momo.setField3(new double[3]);
        System.out.println("변경된 field3 확인합니다.");
        momo.printData();
        momo.setField3(tempArray);
        System.out.println("변경된 field3 확인합니다.");
        momo.printData();

        // setField3을 변수로 전달했을 때
        tempArray[2] = 3.1415; // 변경된 값이 momo 객체에도 반영되는지 확인해보세요.
        System.out.println("변경된 field3 확인합니다.");
        momo.printData();

    }
}
