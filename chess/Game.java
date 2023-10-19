import java.util.Scanner;
public class Game {
    public Game () {
        this.populateBoard();
    }
    Space[][] board = new Space[8][8];
    private boolean winner = false;

    public Space getSpace (int column, int row) {
        return board[column][row];
    }
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

    public void movePiece (Space start, Space end) {
        

    }
    public void printBoard () {
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 8; j++) {
                if ((board[i][j].isOccupied())) {
                    System.out.print(" | " + board[i][j].piece.getSymbol());
                } else {
                    System.out.print(" |  ");
                }
            }
            System.out.println();
        }
        System.out.println("     1   2   3   4   5   6   7   8");
    }

    public Space getLocation (String context) {
        int row;
        int column;
        Scanner inputCol = new Scanner(System.in);
        do {
            System.out.print("\nEnter the column number containing the " +
                    (context.equals("start") ? "piece you'd like to move: " : "space you'd like to move to: "));
            while (!(inputCol.hasNextInt())) {
                System.out.println("No integer found, please try again!");
                inputCol.next();
            }
            column = inputCol.nextInt();
        } while (column < 1 || column > 8);

        Scanner inputRow = new Scanner(System.in);
        do {
            System.out.print("\nEnter the row number containing the " +
                    (context.equals("start") ? "piece you'd like to move: " : "space you'd like to move to: "));
            while (!(inputRow.hasNextInt())) {
                System.out.println("No integer found, please try again!");
                inputRow.next();
            }
            row = inputRow.nextInt();
        } while (row < 1 || row > 8);

        return getSpace(column - 1, row - 1);
    }
}