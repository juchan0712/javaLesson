package object.day8_Interface.beable;

public class Dog implements Runnable {

    @Override
    public String run(int speed) {
        
        return "Dog 은 " + speed + "km/h로 달립니다.\n 최대속도 50km\n ...";
    }

    @Override
    public String beAble() {
        
        return "달리기";
    }


    
}

