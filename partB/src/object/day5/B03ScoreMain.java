package object.day5;

public class B03ScoreMain {

    public static void main(String[] args) {

        // 학생 4명의 성적을 저장해보세요.
        // 1학년 2명(모모, 다현) 3과목 2학년 2명(나연, 쯔위) 4과목
        // 점수는 마음대로 저장하세요.

        Score momo = new Score();

        String a = "모모";
        momo.setName("모모");
        momo.setGrade(1);
        int[] jumsues = { 90, 80, 80 };
        momo.setJumsuse(jumsues);
        momo.printData();

        momo.setName("다현");
        momo.setGrade(1);
        int[] jumsues1 = { 77, 85, 80 };
        momo.setJumsuse(jumsues1);
        momo.printData();

        momo.setName("나연");
        momo.setGrade(2);
        int[] jumsues2 = { 100, 99, 98, 97 };
        momo.setJumsuse(jumsues2);
        momo.printData();

        momo.setName("쯔위");
        momo.setGrade(2);
        int[] jumsues3 = { 98, 78, 80, 70 };
        momo.setJumsuse(jumsues3);
        momo.printData();

    }

}
