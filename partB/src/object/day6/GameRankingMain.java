package object.day6;

public class GameRankingMain {

    public static void main(String[] args) {

        // GameRanking 객체 5개 만들기
        GameRanking LoL = new GameRanking(1, "리그오브레전드", 37.21, "라이엇", new String[1]);
        GameRanking FConline = new GameRanking(2, "FC온라인", 19.54, "넥슨", new String[1]);
        GameRanking Valo = new GameRanking(3, "발로란트", 6.44, "라이엇", new String[1]);
        GameRanking Rost = new GameRanking(4, "로스트아크", 6.34, "스마일", new String[1]);
        GameRanking Maple = new GameRanking(5, "메이플스토리", 5.06, "넥슨", new String[1]);

        // 출력
        System.out.println("----------------------------PC방게임랭킹----------------------------");
        //롤의 etc 필드 배열요서 0번에 "장르" 문자열을 저장하세요.
        String[] temp = LoL.getEtc();
        temp[0] = "RTS";
        System.out.println(LoL.getDaTa());

        //FConline의 etc 필드 배열요서 0번에 "장르" 문자열을 저장하세요.
        String[] temp1 = FConline.getEtc();
        temp1[0] = "스포츠";
        System.out.println(FConline.getDaTa());

        //발로란트의 etc 필드 배열요서 0번에 "장르" 문자열을 저장하세요.
        String[] temp2 = Valo.getEtc();
        temp2[0] = "FPS";
        System.out.println(Valo.getDaTa());

        //로스트아크의 etc 필드 배열요서 0번에 "장르" 문자열을 저장하세요.
        String[] temp3 = Rost.getEtc();
        temp3[0] = "RPG";
        System.out.println(Rost.getDaTa());

        //메이플스토리의 etc 필드 배열요서 0번에 "장르" 문자열을 저장하세요.
        String[] temp4 = Maple.getEtc();
        temp4[0] = "RPG";
        System.out.println(Maple.getDaTa());

        

    }
}
