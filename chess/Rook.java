public class Rook extends Piece {

    public Rook(boolean black) {
        super(black);
    }
    public final int[][] validDirections = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265C';
        }
        else {
            return '\u2656';
        }
    }
}