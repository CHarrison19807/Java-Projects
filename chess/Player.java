import java.util.Scanner;

public class Player {
    private final String name;
    private final boolean black;

    public Player(int val) {
        this.name = setName(val);
        this.black = val != 1;
    }

    private String setName(int val) {
        Scanner inputName = new Scanner(System.in);
        do {
            System.out.println("Player " + val + " please enter your name, you are the " + (isBlack() ? "black" : "white") + " pieces!");
        } while (!(inputName.hasNext()));
        return inputName.next();
    }

    public boolean isBlack() {
        return black;
    }

    public String getName() {
        return name;
    }
}