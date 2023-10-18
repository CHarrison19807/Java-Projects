public class Game {
    Space[][] board = new Space[8][8];
    private boolean winner = false;

    public void populateBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0) {
                    if (j == 0 || j == 7) {
                        board[i][j] = new Space(i, j, new Rook(false));
                    } else if (j == 1 || j == 6) {
                        board[i][j] = new Space(i, j, new Knight(false));
                    } else if (j == 2 || j == 5) {
                        board[i][j] = new Space(i, j, new Bishop(false));
                    } else if (j == 3) {
                        board[i][j] = new Space(i, j, new Queen(false));
                    } else {
                        board[i][j] = new Space(i, j, new King(false));
                    }
                } else if (i == 7) {
                    if (j == 0 || j == 7) {
                        board[i][j] = new Space(i, j, new Rook(true));
                    } else if (j == 1 || j == 6) {
                        board[i][j] = new Space(i, j, new Knight(true));
                    } else if (j == 2 || j == 5) {
                        board[i][j] = new Space(i, j, new Bishop(true));
                    } else if (j == 3) {
                        board[i][j] = new Space(i, j, new Queen(true));
                    } else {
                        board[i][j] = new Space(i, j, new King(true));
                    }
                } else if (i == 6) {
                    board[i][j] = new Space (i, j, new Pawn(true));
                } else if (i == 1) {
                    board[i][j] = new Space (i, j, new Pawn(false));
                }
                else {
                    board[i][j] = new Space(i, j);
                }
            }
        }
    }

    public void printBoard () {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((board[i][j].isOccupied())) {
                    System.out.print(board[i][j].piece.getSymbol() + " | ");
                } else {
                    System.out.print("  | ");
                }
            }
            System.out.println();
        }
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}