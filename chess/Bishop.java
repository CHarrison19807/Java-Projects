public class Bishop extends Piece {

    public Bishop(boolean black) {
        super(black);
    }
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265D';
        }
        else {
            return '\u2657';
        }
    }
}