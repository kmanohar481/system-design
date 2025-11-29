package cricbuzz.Team.Player;

import java.util.*;

public class PlayerBattingController {

     PlayerDetails striker;
     PlayerDetails nonStriker;

     Queue<PlayerDetails> yetToPlay;

     public PlayerBattingController(List<PlayerDetails> playing11){
         yetToPlay = new LinkedList<>();
         yetToPlay.addAll(playing11);

     }

     public PlayerDetails getStriker(){
         return this.striker;
     }

     public PlayerDetails getNonStriker(){
         return this.nonStriker;
     }

     public void setStriker(PlayerDetails striker){
         this.striker =  striker;
     }

    public void setNonStriker(PlayerDetails nonStriker){
        this.nonStriker =  nonStriker;
    }

    public void getNextPlayer() throws Exception {

        if (yetToPlay.isEmpty()) {
            throw new Exception();
        }

        if (striker == null) {
            striker = yetToPlay.poll();
        }

        if (nonStriker == null) {
            nonStriker = yetToPlay.poll();
        }
    }





}
