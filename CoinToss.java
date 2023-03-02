import java.util.Scanner;

enum Coin {heads, tails}

public class CoinToss {
    private static int headsCount = 0;
    private static int tailsCount = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("quit")) {
            System.out.println("Enter 'f' to flip a coin, Enter 'quit' to quit the program: ");
            choice = input.nextLine();
            if (choice.equals("f")) {
                Coin result = flip();
                System.out.println("The coin landed on " + result);
                if (result == Coin.heads) {
                    headsCount++;
                } 
                else {
                    tailsCount++;
                }
                System.out.println("Heads: " + headsCount + " Tails: " + tailsCount + "\n");
            }
        }
    }
    
    public static Coin flip() {
        return Math.random() < 0.5 ? Coin.heads : Coin.tails;
    }
}