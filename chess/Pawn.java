public class Pawn extends Piece {

    public Pawn(boolean black) {
        super(black);
    }
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265F';
        }
        else {
            return '\u2659';
        }
    }
}