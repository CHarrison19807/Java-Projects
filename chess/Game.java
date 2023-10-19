import java.util.Scanner;
public class Game {

    public Game () {
        this.populateBoard();

    }
    Player playerOne = new Player(1);
    Player playerTwo = new Player(2);
    Space[][] board = new Space[8][8];
    private boolean playerOneTurn = false;

    public boolean isPlayerOneTurn() {
        return playerOneTurn;
    }

    public void changeTurn() {
        if (playerOneTurn) {
            this.playerOneTurn = false;
        } else {
            this.playerOneTurn = true;
        }
        System.out.println((playerOneTurn ? playerOne.getName() : playerTwo.getName()) + " it is your turn!");
    }

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
    public boolean validMove (Space start, Space end) {
        if (!(start.isOccupied())) {
            System.out.println("There is no piece at the first location, please try again!");
            movePiece((playerOneTurn ? playerOne : playerTwo), getLocation("start"), getLocation("end"));
            return false;
        } else if (end.isOccupied()) {
                if (start.piece.isBlack() == end.piece.isBlack()) {
                    System.out.println("You can not attack your own piece, please try again!");
                    movePiece((playerOneTurn ? playerOne : playerTwo), getLocation("start"), getLocation("end"));
                    return false;
                }
        } else if (playerOneTurn != start.piece.isBlack()) {
            System.out.println("You can not move the opponent's piece, please try again!");
            movePiece((playerOneTurn ? playerOne : playerTwo), getLocation("start"), getLocation("end"));
            return false;
        } else if (!(start.piece.getClass().equals(Knight.class))) {
            // check if piece 'jumps' over other pieces
        } else if (/*piece can not move to end*/) {

        }
        return true;
    }
    public void movePiece (Player player, Space start, Space end) {
        if (validMove(start, end)) {
            System.out.println(player.getName() + " it is your turn!");

        }
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

        return getSpace(row - 1, column - 1);
    }


}