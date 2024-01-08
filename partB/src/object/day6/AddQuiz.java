package object.day6;

public class AddQuiz {
    private int data1;
    private int data2;
    private String question;
    private int userAnswer;
    private int answer;

    public int getData1(){
        return this.data1;
    }

    public int getData2(){
        return this.data2;
    }
    
    public String getQuestion() {
        return question;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public int getAnswer() {
        return answer;
    }

    public AddQuiz(String question, int answer) {
        this.question = question;
        this.answer = answer;
    }

    public void setData1(int data1){
        this.data1 = data1;
    }
    
    public void setData2(int data2){
        this.data2 = data2;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    public boolean isCorrect() {
        return userAnswer == answer;
    }

    
}
