package object.day6;

import java.util.Arrays;

public class GameRanking {

    private int Ranking; // 순위
    private String gameName; // 게임 이름
    private double Share; // 점유율
    private String company; // 회사
    private String[] etc;   // 장르

    // 커스텀 생성자 만들기.
    public GameRanking(int Ranking, String gameName, double Share, String company, String[] etc) {
        this.Ranking = Ranking;
        this.gameName = gameName;
        this.Share = Share;
        this.company = company;
        this.etc = etc;
    }

    // getter 만들기
    public int getRanking() {
        return Ranking;
    }

    public String getGameName() {
        return gameName;
    }

    public double getShare() {
        return Share;
    }

    public String getCompany() {
        return company;
    }

    public String[] getEtc() {
        return etc;
    }

    // 모든 필드값을 이용해서 문자열을 만들어 리턴합니다.
    public String getDaTa() {
        return String.format("%d\t %s\t %10.2f\t %s\t %10s", Ranking, gameName, Share, company, Arrays.toString(etc));
    }
}
