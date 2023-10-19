public class Knight extends Piece {

    public Knight(boolean black) {
        super(black);
    }
    public final int[][] validDirections = {{1, 2}, {2, 1}, {1, -2}, {-2, 1}, {2, -1}, {-1, 2}, {-1, -2}, {-1, -2}};

    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265E';
        }
        else {
            return '\u2658';
        }
    }
}