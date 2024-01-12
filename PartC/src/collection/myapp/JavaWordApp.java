package collection.myapp;

import java.util.List;
import java.util.Scanner;

public class JavaWordApp {
    
    public static void main(String[] args) {
        
        //단어장을 시작하는 프로그램입니다.
        // 1. 단어장을 생성
        JavaWordBook myBook = new JavaWordBook();
        
        // 2. 단어 추가
        JavaWord newWord = new JavaWord("public", "공용의", 1);
        myBook.addWord(newWord);
        myBook.addWord(new JavaWord("private", "개인적인", 1));
        myBook.addWord(new JavaWord("protected", "보호하는", 1));
        myBook.addWord(new JavaWord("iterate", "반복하다", 3));
        myBook.addWord(new JavaWord("collection", "수집", 2));
        myBook.addWord(new JavaWord("application", "응용프로그램", 2));
        myBook.addWord(new JavaWord("binary", "2진수의", 3));
        myBook.addWord(new JavaWord("cool", "시원한", 1));
        //메모장 출력
        myBook.wordAllPrint(); 

        // 3. 단어 조회
        // 1) 영어단어 입력하면 찾아주기
        //String findText = "";
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("조회 할 단어를 입력해주세요 >>>");
            String findText = sc.nextLine();
            if(findText.equals("end")) break;
            JavaWord result = myBook.searchWord(findText);
            System.out.println(findText + "조회 결과 : " + result);
        }    
        
        //JavaWord result = myBook.searchWord(findText);
        //System.out.println(findText + "조회 결과 : " + result);
        // 2) List<JavaWord>searcWordByLevel(int level)
        List<JavaWord> list = myBook.searchWordByLevel(1);
        myBook.wordListPrint(list);
        List<JavaWord> list1 = myBook.searchWordByLevel(2);
        myBook.wordListPrint(list1);
        List<JavaWord> list2 = myBook.searchWordByLevel(3);
        myBook.wordListPrint(list2);
        
        

        
        // 4. 단어 삭제
        myBook.removeWord("cool");
        System.out.println("삭제후 내용 : " + myBook);

        myBook.wordAllPrint();
    }
}
