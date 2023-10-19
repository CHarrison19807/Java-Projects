public class King extends Piece {

    public King(boolean black) {
        super(black);
    }
    public final int[][] validDirections = {{1, 1}, {1, 0}, {1, -1}, {0, 1}, {0, -1}, {-1, 1}, {-1, 0}, {-1, -1}};

    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265A';
        }
        else {
            return '\u2654';
        }
    }
}