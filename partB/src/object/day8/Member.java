package object.day8;

public class Member {

    protected int age;
    protected String name;

    public Member() {
    }

    public Member(int age, String name) {
        this.name = name;
        this.age = age;
    }

    //다형성 예시 : 메소드 인자가 부모 타입일 때, 실제 객체는 여러 자식 객체가 될 수 있습니다.
	public boolean isAdopt(Animal animal) {
        //강아지는 15세이상, 고양이는 18세이상, 토끼는 13세 이상 분양받을 수 있습니다.
        //AND 연산 특징 : 참 && 참 = 참, 참 && 거짓 = 거짓, 거짓 && 참 = 거짓, 거짓 && 거짓 = 거짓 (하나라도 거짓이면 거짓)
        //OR 연산 특징 : 참 || 참 = 참, 참 || 거짓 = 참, 거짓 || 참 = 참, 거짓 || 거짓 = 거짓 (하나라도 참이면 참)
        if(animal instanceof Puppy && age >= 17){
            return true;
        }else if(animal instanceof Cat && age >= 19){
            return true;
        }else if(animal instanceof Rabbit && age >= 13){
            return true;
        }else if(age >= 20){
            return true;
        }else{
            return false;
        }
    }   

}
