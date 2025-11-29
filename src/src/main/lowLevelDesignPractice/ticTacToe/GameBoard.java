package ticTacToe;

public class GameBoard {

    public int size;
    public PlayingPiece[][] board;

    public GameBoard(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row,int column, PlayingPiece playingPiece){
        if(board[row][column] == null){
            board[row][column] = playingPiece;
            return true;
        }
        return false;
    }

    public void printBoard(){

        for(int i = 0 ; i < size ; i++ ){

            for(int j=0; j< size ; j++){

                if(board[i][j] != null) {
                    System.out.print( board[i][j].piece.name() + "  ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.println("_______");
        }
    }

    public boolean hasFreeCells(){

        for(int i = 0 ; i < size ; i++) {
            for(int j =0 ; j < size ; j++){
                if(board[i][j]==null){
                    return true;
                }
            }
        }
        return false;
    }

}
