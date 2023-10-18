public class Space {

    private boolean occupied;
    Piece piece;
    public Space (int column, int row, Piece piece) {
        this.occupied = true;
        this.piece = piece;
    }
    public Space (int column, int row) {
        this.occupied = false;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isOccupied() {
        return occupied;
    }
}