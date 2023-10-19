public class Pawn extends Piece {

    public Pawn(boolean black) {
        super(black);
    }
    public final int[][] validDirections = {{1, 0}, {-1, 0}};
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265F';
        }
        else {
            return '\u2659';
        }
    }
}