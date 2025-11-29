package ticTacToe;

public class PlayGame {

    public static void main(String[] args){

        System.out.println("game has been started");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.initializeGame();
        System.out.println("game winner is " + ticTacToeGame.startGame());
    }
}
