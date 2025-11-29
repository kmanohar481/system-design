package cricbuzz.Innings;

import cricbuzz.Team.Player.PlayerDetails;
import cricbuzz.Team.Team;

import java.util.List;
import java.util.ArrayList;

public class OversDetails {

    List<BallDetails> balls;
    int overNumber;
    int extraBallsCount;
    PlayerDetails bowledBy;

    OversDetails(int overNumber, PlayerDetails bowledBy){
        this.overNumber = overNumber;
        balls = new ArrayList<>();
        this.bowledBy = bowledBy;
    }

    public boolean startOver(Team battingTeam, Team bowlingTeam, int runsToWin) throws Exception{

        int ballCount = 1;
        while(ballCount<=6){

            BallDetails ball = new BallDetails(ballCount);
            ball.startBallDelivery(battingTeam, bowlingTeam, this);
            if(ball.ballType == BallType.NORMAL) {
                balls.add(ball);
                ballCount++;
                if(ball.wicket != null) {
                    battingTeam.chooseNextBatsMan();
                }

                if( runsToWin != -1 && battingTeam.getTotalRuns() >= runsToWin){
                    battingTeam.isWinner = true;
                    return true;
                }
            }
            else {
                extraBallsCount++;
            }
        }
        return false;
    }


}
