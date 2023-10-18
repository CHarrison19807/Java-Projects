public class King extends Piece {

    public King(boolean black) {
        super(black);
    }
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265A';
        }
        else {
            return '\u2654';
        }
    }
}