package cricbuzz.Team.Player;

import cricbuzz.Team.Player.Score.BattingScoreCard;
import cricbuzz.Team.Player.Score.BowlingScoreCard;


public class PlayerDetails {

    public Player player;
    public PlayerType playerType;

    public BattingScoreCard battingScoreCard;
    public BowlingScoreCard bowlingScoreCard;

    public PlayerDetails(Player person, PlayerType playerType){
        this.player = person;
        this.playerType = playerType;
        battingScoreCard = new BattingScoreCard();
        bowlingScoreCard = new BowlingScoreCard();
    }

    public void printBattingScoreCard(){

        System.out.println("PlayerName: " + player.name + " -- totalRuns: " + battingScoreCard.totalRuns
                + " -- totalBallsPlayed: " + battingScoreCard.totalBallsPlayed + " -- 4s: " + battingScoreCard.totalFours
                + " -- 6s: " + battingScoreCard.totalSix + " -- outby: " +   ((battingScoreCard.wicketDetails != null) ? battingScoreCard.wicketDetails.wicketTakenBy : "notout"));
    }

    public void printBowlingScoreCard(){
        System.out.println("PlayerName: " + player.name + " -- totalOversThrown: " + bowlingScoreCard.totalOversCount
                + " -- totalRunsGiven: " + bowlingScoreCard.runsGiven + " -- WicketsTaken: " + bowlingScoreCard.wicketsTaken);
    }






}
