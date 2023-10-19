public class Main {


    public static void main(String args[]) {
        Game newGame = new Game();
        newGame.printBoard();
        System.out.println(newGame.board[7][1].piece.getSymbol());
        Player playerTwo = newGame.playerTwo;
        System.out.println(newGame.board[7][1].piece.getClass().equals(Knight.class));
        newGame.changeTurn();
        newGame.movePiece(playerTwo, newGame.getLocation("start"), newGame.getLocation("end"));
    }

}