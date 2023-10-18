public class Rook extends Piece {

    public Rook(boolean black) {
        super(black);
    }
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265C';
        }
        else {
            return '\u2656';
        }
    }
}