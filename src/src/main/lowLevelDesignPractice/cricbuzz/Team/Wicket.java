package cricbuzz.Team;

import cricbuzz.Innings.BallDetails;
import cricbuzz.Team.Player.PlayerDetails;
import cricbuzz.Innings.OversDetails;

public class Wicket {

    public WicketType wicketType;
    public PlayerDetails wicketTakenBy;
    public OversDetails overDetails;
    public BallDetails ballDetails;


    public Wicket(WicketType wicketType, PlayerDetails wicketTakenBy, OversDetails overDetails, BallDetails ballDetails) {
        this.wicketType = wicketType;
        this.wicketTakenBy = wicketTakenBy;
        this.overDetails = overDetails;
        this.ballDetails = ballDetails;
    }
}
