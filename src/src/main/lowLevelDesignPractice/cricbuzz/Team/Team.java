package cricbuzz.Team;

import cricbuzz.Team.Player.Player;
import cricbuzz.Team.Player.PlayerBattingController;
import cricbuzz.Team.Player.PlayerBowlingController;
import cricbuzz.Team.Player.PlayerDetails;

import java.util.List;

public class Team {

    public List<Player> extraPlayer;

    public List<PlayerDetails> playing11;

    public PlayerBattingController battingController;
    public PlayerBowlingController bowlingController;

    public String teamName;

    public int totalRuns;

    public boolean isWinner;


    public Team(List<Player> extraPlayer, List<PlayerDetails> playing11, String teamName,List<PlayerDetails> bowlers) {
        this.extraPlayer = extraPlayer;
        this.playing11 = playing11;
        this.teamName = teamName;
        this.battingController = new PlayerBattingController(playing11);
        this.bowlingController = new PlayerBowlingController(bowlers);
    }

    public List<Player> getExtraPlayer() {
        return extraPlayer;
    }

    public void setExtraPlayer(List<Player> extraPlayer) {
        this.extraPlayer = extraPlayer;
    }

    public List<PlayerDetails> getPlaying11() {
        return playing11;
    }

    public void setPlaying11(List<PlayerDetails> playing11) {
        this.playing11 = playing11;
    }

    public PlayerBattingController getBattingController() {
        return battingController;
    }

    public void setBattingController(PlayerBattingController battingController) {
        this.battingController = battingController;
    }

    public PlayerBowlingController getBowlingController() {
        return bowlingController;
    }

    public void setBowlingController(PlayerBowlingController bowlingController) {
        this.bowlingController = bowlingController;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public PlayerDetails getCurrentBowler() {
        return bowlingController.getCurrentBowler();
    }

    public PlayerDetails getStriker() {
        return battingController.getStriker();
    }

    public PlayerDetails getNonStriker() {
        return battingController.getNonStriker();
    }

    public void setStriker(PlayerDetails player) {
        battingController.setStriker(player);
    }

    public void setNonStriker(PlayerDetails player) {
        battingController.setNonStriker(player);
    }

    public void chooseNextBatsMan() throws Exception{
        battingController.getNextPlayer();
    }

    public void chooseNextBowler(int maxOverCountPerBowler){
        bowlingController.getNextBowler(maxOverCountPerBowler);
    }

    public void printBattingScoreCard(){

        for(PlayerDetails playerDetails : playing11){
            playerDetails.printBattingScoreCard();
        }
    }

    public void printBowlingScoreCard(){

        for(PlayerDetails playerDetails : playing11){
            if(playerDetails.bowlingScoreCard.totalOversCount > 0) {
                playerDetails.printBowlingScoreCard();
            }
        }
    }

}
