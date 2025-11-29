package cricbuzz;

public class T20MatchType implements MatchType {

    @Override
    public int numberOfOvers(){
        return 20;
    }

    @Override
    public int maxOverCountBowlers(){
        return 4;
    }

}
