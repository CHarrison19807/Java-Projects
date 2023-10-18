public class Knight extends Piece {

    public Knight(boolean black) {
        super(black);
    }
    public char getSymbol() {
        if (this.isBlack()) {
            return '\u265E';
        }
        else {
            return '\u2658';
        }
    }
}