package cricbuzz.Innings;

import cricbuzz.MatchType;
import cricbuzz.Team.Player.PlayerDetails;
import cricbuzz.Team.Team;

import java.util.ArrayList;
import java.util.List;

public class InningDetails {

    Team battingTeam ;

    Team bowlingTeam;

    List<OversDetails> overs;

    MatchType matchType;

    public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        this.overs = new ArrayList<>();
    }

    public void start(int runsToWin){
        //set batting players
        try {
            battingTeam.chooseNextBatsMan();
        }catch (Exception e) {

        }

        int noOfOvers = matchType.numberOfOvers();
        for (int overNumber = 1; overNumber <= noOfOvers; overNumber++) {

            //chooseBowler
            bowlingTeam.chooseNextBowler(matchType.maxOverCountBowlers());

            OversDetails over = new OversDetails(overNumber, bowlingTeam.getCurrentBowler());
            overs.add(over);
            try {
                boolean won = over.startOver(battingTeam, bowlingTeam, runsToWin);
                if(won == true) {
                    break;
                }
            }catch (Exception e) {
                break;
            }

            //swap striket and non striker
            PlayerDetails temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }

    }


    public int getTotalRuns(){
        return battingTeam.getTotalRuns();
    }



}
