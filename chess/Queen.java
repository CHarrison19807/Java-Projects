public class Queen extends Piece {

    public Queen(boolean black) {
        super(black);
    }
    public final int[][] validDirections = {{1, 1}, {1, 0}, {1, -1}, {0, 1}, {0, -1}, {-1, 1}, {-1, 0}, {-1, -1}};
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265B';
        }
        else {
            return '\u2655';
        }
    }
}