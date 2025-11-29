package cricbuzz.ScoreUpdater;




import cricbuzz.Innings.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
