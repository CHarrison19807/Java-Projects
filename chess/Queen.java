public class Queen extends Piece {

    public Queen(boolean black) {
        super(black);
    }
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265B';
        }
        else {
            return '\u2655';
        }
    }
}