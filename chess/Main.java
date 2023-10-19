public class Main {


    public static void main(String args[]) {
        Game newGame = new Game();
        newGame.printBoard();
        newGame.getLocation("start");
        Player playerOne = new Player(1);
        Player playerTwo = new Player(2);
        newGame.movePiece(newGame.getLocation("start"), newGame.getLocation("end"));
    }

}