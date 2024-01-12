package collection.myapp;

public class JavaWord {
    
    private String english;
    private String korean;
    private int level;      // 1 : 초급, 2 : 중급, 3 : 고급

    public JavaWord(String english, String korean, int levle) {
        this.english = english;
        this.korean = korean;
        this.level = levle;
    }

    @Override
    public String toString() {
        return this.english + "," + this.korean + "," + this.level;
    }

    public String getEnglish() {
        return english;
    }

    public String getKorean() {
        return korean;
    }

    public int getLevel() {
        return level;
    }
}
