import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_NUMBER = 3;
        System.out.println("Guess the number between 1 and " + MAX_NUMBER);
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int r = rd.nextInt(MAX_NUMBER) + 1;

        while (true) {
            System.out.print("Enter your guess: ");
            try {
                int i = sc.nextInt();
                sc.nextLine();

                if (i == r) {
                    System.out.println("You won!");
                    System.out.println("Do you want to play again? Yes/No");
                    String st = sc.nextLine();

                    switch (st.toLowerCase()) {
                        case "yes":
                            r = rd.nextInt(MAX_NUMBER) + 1;
                            System.out.println("Let's play again!");
                            break;
                        case "no":
                            System.out.println("Okay, exiting game.");
                            sc.close();
                            return;
                        default:
                            System.out.println("Invalid choice. Exiting the game.");
                            sc.close();
                            return;
                    }
                } else if (i < r) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and " + MAX_NUMBER + ".");
                sc.nextLine();
            }
        }
    }
}
