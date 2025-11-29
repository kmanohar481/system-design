package cricbuzz;

import cricbuzz.Innings.InningDetails;
import cricbuzz.Team.Team;

import java.time.LocalDate;

public class Match {

    Team teamA;

    Team teamB ;

    InningDetails[] innings;

    String venue;

    LocalDate matchDate;

    Team tossWinner;

    MatchType matchType;

    public Match(Team a, Team b, String venue, LocalDate matchDate, MatchType matchType) {
        this.teamA = a;
        this.teamB = b;
        this.innings = new InningDetails[2];
        this.venue = venue;
        this.matchDate = matchDate;
        this.matchType = matchType;
    }

    public void startMatch(){

        tossWinner = toss(teamA, teamB);

        System.out.println("toss has won by " + tossWinner.getTeamName());

        for(int inning = 1 ; inning<=2 ; inning++){

            InningDetails inningDetails;
            Team bowlingTeam;
            Team battingTeam;

            boolean isChasing  = false;

            if(inning == 1 ){
                battingTeam = tossWinner;
                bowlingTeam = tossWinner.getTeamName().equals(teamA.getTeamName()) ? teamB : teamA ;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start(-1);
            }else{
                bowlingTeam = tossWinner;
                battingTeam  = tossWinner.getTeamName().equals(teamA.getTeamName()) ? teamB : teamA ;
                inningDetails = new InningDetails(battingTeam, bowlingTeam, matchType);
                inningDetails.start(innings[0].getTotalRuns());
                if(bowlingTeam.getTotalRuns() > battingTeam.getTotalRuns()){
                    bowlingTeam.isWinner = true;
                }
            }

            innings[inning-1] = inningDetails;

            //print inning details
            System.out.println();
            System.out.println("INNING " + inning + " -- total Run: " + battingTeam.getTotalRuns());
            System.out.println("---Batting ScoreCard : " + battingTeam.teamName + "---");

            battingTeam.printBattingScoreCard();

            System.out.println();
            System.out.println("---Bowling ScoreCard : " + bowlingTeam.teamName + "---");
            bowlingTeam.printBowlingScoreCard();

        }

        System.out.println();
        if(teamA.isWinner){
            System.out.println("---WINNER---" + teamA.teamName);

        }else {
            System.out.println("---WINNER---" + teamB.teamName);

        }

    }


    private Team toss(Team teamA, Team teamB){

        if(Math.random() < 0.5) {
            return teamA;
        } else {
            return teamB;
        }
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public InningDetails[] getInnings() {
        return innings;
    }

    public void setInnings(InningDetails[] innings) {
        this.innings = innings;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public Team getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(Team tossWinner) {
        this.tossWinner = tossWinner;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }
}
