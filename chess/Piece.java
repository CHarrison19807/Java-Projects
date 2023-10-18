public abstract class Piece {
    private boolean killed = false;
    private boolean black = false;
    public abstract char getSymbol();

    public Piece (boolean black) {
        this.setBlack(black);
    }
    public boolean isBlack () {
        return this.black;
    }
    public void setBlack (boolean black) {
        this.black = black;
    }

    public boolean isKilled () {
        return this.killed;
    }

    public void setKilled (boolean killed) {
        this.killed = killed;
    }
}