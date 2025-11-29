package ticTacToe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;
    GameBoard board;


    public void initializeGame(){

        PlayingPiece x = new PlayingPieceX();
        PlayingPiece o = new PlayingPiece0();

        Player ram = new Player("ram", x);
        Player shyam = new Player("shyam", o);
        players = new ArrayDeque<>();

        players.add(ram);
        players.add(shyam);

        board = new GameBoard(3);

    }

    public String startGame(){

        boolean noWinner = true;

        while (noWinner) {

            Player playerTurn = players.removeFirst();
            boolean hasAvailableSpace  =  board.hasFreeCells();
            if(!hasAvailableSpace){
                noWinner = false;
                continue;
            }

            board.printBoard();

            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");

            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = board.addPiece(inputRow , inputColumn , playerTurn.piece);

            if(!pieceAddedSuccessfully){
                System.out.println("incorrect position, please choose another row and another column ");
                players.addFirst(playerTurn);
                continue;
            }
            boolean gameEnded  = isThereWinner(inputRow,inputColumn, playerTurn.piece);
            if(gameEnded){
                return playerTurn.name;
            }
            players.addLast(playerTurn);

        }

        return "tie";
    }

    public boolean isThereWinner(int row, int column, PlayingPiece piece){

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i = 0 ; i < board.size ; i++) {
            if(board.board[row][i] == null || board.board[row][i] != piece){
                 rowMatch = false;
            }
        }

        for(int i = 0 ; i < board.size ; i++) {
            if(board.board[i][column] == null || board.board[i][column] != piece){
                columnMatch = false;
            }
        }

        for(int i = 0 ; i < board.size ; i++) {
            for(int j = 0 ; j< board.size ; j++) {
                if (board.board[i][j] == null || board.board[i][j] != piece) {
                    diagonalMatch = false;
                }
            }
        }

        for(int i = 0 ; i < board.size ; i++) {
            for(int j = board.size-1 ; j>0 ; j--) {
                if (board.board[i][j] == null || board.board[i][j] != piece) {
                    antiDiagonalMatch = false;
                }
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }



}
