package cricbuzz;

public class OneDayMatch implements MatchType {

    @Override
    public int numberOfOvers(){
        return 50;
    }

    @Override
    public int maxOverCountBowlers(){
        return 10;
    }

}
