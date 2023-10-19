public class Bishop extends Piece {

    public Bishop(boolean black) {
        super(black);
    }
    public final int[][] validDirections = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265D';
        }
        else {
            return '\u2657';
        }
    }
}