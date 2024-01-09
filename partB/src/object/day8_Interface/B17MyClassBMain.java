package object.day8_Interface;

public class B17MyClassBMain {

    public static void main(String[] args) {

        // 구현클래스로 객체 생성
        MyClassB myb = new MyClassB();

        // 업 캐스팅
        // 다중 구현 클래스인 MyClassB는 두가지 업 캐스팅 가능합니다.
        InterfaceA ifa = new MyClassB();
        InterfaceX ifx = new MyClassB();

        // 다운 캐스팅 가능합니다.
        MyClassB temp = (MyClassB) ifx;

        myb.methodA();
        ifa.methodA();
        //ifx.methodA();  //오류 : methodA는 InterfaceA의 추상메소드.
                          //다른 인터페이스 참조 타입으로는 메소드 실행 못함
        
        ifx.methodX();
        //ifa.methodX();  //오류 : medthodX는 InterfaceX의 추상메소드.
                          //다른 인터페이스 참조 타입으로는 메소드 실행 못함.
    
        InterfaceX ix = (InterfaceX) ifa;
        ix.methodX();
                        
                        
    }
}
