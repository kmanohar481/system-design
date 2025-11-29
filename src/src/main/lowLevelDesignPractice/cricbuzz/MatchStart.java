package cricbuzz;

import cricbuzz.Team.Player.Player;
import cricbuzz.Team.Player.PlayerDetails;
import cricbuzz.Team.Player.PlayerType;
import cricbuzz.Team.Team;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.PropertyResourceBundle;

public class MatchStart {

    public static void main(String[] args){

        Team a  = addTeam("India");
        Team b =  addTeam("SriLanka");

        MatchType matchType = new T20MatchType();

        Match match = new Match(a,b, "pune", null , matchType);

        match.startMatch();
    }

    private static Team addTeam(String teamName){

        List<PlayerDetails> playerDetails = new ArrayList<>();

        PlayerDetails p1 = addPlayer(teamName+"1", PlayerType.ALL_ROUNDER);
        PlayerDetails p2 = addPlayer(teamName+"2", PlayerType.ALL_ROUNDER);
        PlayerDetails p3 = addPlayer(teamName+"3", PlayerType.ALL_ROUNDER);
        PlayerDetails p4 = addPlayer(teamName+"4", PlayerType.ALL_ROUNDER);
        PlayerDetails p5 = addPlayer(teamName+"5", PlayerType.ALL_ROUNDER);
        PlayerDetails p6 = addPlayer(teamName+"6", PlayerType.ALL_ROUNDER);
        PlayerDetails p7 = addPlayer(teamName+"7", PlayerType.ALL_ROUNDER);
        PlayerDetails p8 = addPlayer(teamName+"8", PlayerType.ALL_ROUNDER);
        PlayerDetails p9 = addPlayer(teamName+"9", PlayerType.ALL_ROUNDER);
        PlayerDetails p10 = addPlayer(teamName+"10", PlayerType.ALL_ROUNDER);
        PlayerDetails p11 = addPlayer(teamName+"11", PlayerType.ALL_ROUNDER);

        playerDetails.add(p1);
        playerDetails.add(p2);
        playerDetails.add(p3);
        playerDetails.add(p4);
        playerDetails.add(p5);
        playerDetails.add(p6);
        playerDetails.add(p7);
        playerDetails.add(p8);
        playerDetails.add(p9);
        playerDetails.add(p10);
        playerDetails.add(p11);

        List<PlayerDetails> bowlers = new ArrayList<>();
        bowlers.add(p7);
        bowlers.add(p8);
        bowlers.add(p9);
        bowlers.add(p10);
        bowlers.add(p11);

        Team team = new Team(new ArrayList<>(),playerDetails,teamName,bowlers);

        return team;

    }

    private static PlayerDetails addPlayer(String playerName, PlayerType playerType){
        Player player = new Player();
        player.setName(playerName);
        return new PlayerDetails(player , playerType);
    }

}
