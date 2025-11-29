package cricbuzz.Team.Player;

import cricbuzz.Team.Player.Score.BattingScoreCard;
import cricbuzz.Team.Player.Score.BowlingScoreCard;

public class Player {

    String name;

    int age;

    String address;

    BattingScoreCard battingScoreCard;

    BowlingScoreCard bowlingScoreCard;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BattingScoreCard getBattingScoreCard() {
        return battingScoreCard;
    }

    public void setBattingScoreCard(BattingScoreCard battingScoreCard) {
        this.battingScoreCard = battingScoreCard;
    }

    public BowlingScoreCard getBowlingScoreCard() {
        return bowlingScoreCard;
    }

    public void setBowlingScoreCard(BowlingScoreCard bowlingScoreCard) {
        this.bowlingScoreCard = bowlingScoreCard;
    }
}
