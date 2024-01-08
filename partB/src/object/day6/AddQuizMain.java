package object.day6;

import java.util.Scanner;

public class AddquizMain {
    public static void main(String[] args) {
        
        int start = 11;
        int end = 99;
        int quizCount = 3;

        AddQuiz[] quizz = new AddQuiz[quizCount];
        

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quizCount; i++) {
            AddQuiz quiz = new AddQuiz(null, i);
            int data1 = (int) (Math.random() * (end - start + 1)) + start;
            quiz.setData1(data1);
            int data2 = (int) (Math.random() * (end - start + 1)) + start;
            quiz.setData2(data2);
            int answer = data1 + data2;

            String question = (i + 1) + "번. " + quiz.getData1() + "+" + quiz.getData2() + "=?";
            quizz[i] = new AddQuiz(question, answer);
        }

        for (AddQuiz quiz : quizz) {
            System.out.println(quiz.getQuestion());
            System.out.print("답을 입력하세요 >>> ");
            int userAnswer = scanner.nextInt();
            quiz.setUserAnswer(userAnswer);
        }

        System.out.println(":::::: 채점 하고 있습니다. ::::::");
        System.out.println("            문제             제출한답              정답         채점");
        int Count = 0;
        for (AddQuiz quiz : quizz) {
            System.out.printf("%17s\t %10d\t %14d\t %10s\n",
                    quiz.getQuestion(), quiz.getUserAnswer(), quiz.getAnswer(),
                    quiz.isCorrect() ? "O" : "X");
            if (quiz.isCorrect()) {
                Count++;
            }
        }
        System.out.println("::: 맞은 갯수 " + Count + " 입니다. :::");
    }
}




