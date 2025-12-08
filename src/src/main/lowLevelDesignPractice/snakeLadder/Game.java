package snakeLadder;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {

    Board board;
    Dice dice;
    Deque<Player> players  = new ArrayDeque<>();

    Player winner;

    public Game(){
        initializeGame();
    }

    private  void initializeGame(){
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null ;
        addPlayers();
    }

    private void addPlayers(){
        Player player1 = new Player("p1");
        Player player2  = new Player("p2");
        players.add(player1);
        players.add(player2);
    }

    public void startGame(){

        while(winner == null ){

            Player player = players.removeFirst();
            System.out.println("player turn is:" + player.getPlayerName() + " current position is: " + player.getCurrentPosition());

            int diceNumber = dice.rollDice();

            int playerNewPosition = player.getCurrentPosition() + diceNumber ;

            if(playerNewPosition >= board.cells.length * board.cells.length){
                winner = player;
                break;
            }

            playerNewPosition = jumpCheck(playerNewPosition);
            player.setCurrentPosition(playerNewPosition);

            players.addLast(player);

        }

        System.out.println("winner of the game is " + winner.getPlayerName());
    }

    private int  jumpCheck(int position){

        Cell cell = board.getCell(position);

        if(cell.getJump()!=null && cell.getJump().getStart() == position){

            String jumpBy = cell.getJump().getStart() > cell.getJump().getEnd() ? "Snake" : "Ladder";
            System.out.println("jump done by " + jumpBy);
            return cell.getJump().getEnd();
        }
        return position;

    }

}
