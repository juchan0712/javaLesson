package object.day5;

import java.util.Arrays;

public class Score {

    private String name;        //학생 이름
    private int grade;          //학년
    private int[] jumsues;      //점수들이 저장될 배열
                                //배열의 크기는 학년마다 다를 수 있음.
    //getter
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int[] getJumsues(){
        return jumsues;
    }

    //setter
    public void setName(String n){
        name = n;
    }
    public void setGrade(int g){
        grade = g;
    }
    public void setJumsuse(int[] j){
        //jumsues = new int[j.length];     //배열을 새로 생성하기
        //for(int i=0; i<j.length; i++)      //f3 배열의 값을 복사하기
                //jumsues[i] = j[i];
        jumsues = j;
    }

    //점수의 합계를 리턴하는 sum() 메소드
    public int sum(){
        int sum=0;
        for(int i=0; i<jumsues.length; i++){
            sum += jumsues[i];
        }
        return sum;
    }
   
    

    //점수의 평균을 double 리턴하는 average() 메소드
    public double average(){
        double avg = 0;
        for(int i=0; i<jumsues.length; i++){
            avg = sum() / jumsues.length; 
        }

        return avg;
    }

    //모든 인스턴스 필드값을 확인하는 printScore() 메소드
    public void printData(){
        System.out.println("이름 : " + name + ",학년 : "+ grade + "학년" + ",과목 " + Arrays.toString(jumsues) + ",총점" + sum() + ",평균" + average());
        System.out.println();
    }

    
}
    
    
