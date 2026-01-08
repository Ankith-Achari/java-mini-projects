import java.util.Random;
import java.util.Scanner;

public class AsciiDice {

    public static void main(String[] args) {

        System.out.println("*******************");
        System.out.println("JAVA DICE ROLLER PROGRAM");
        System.out.println("*******************");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total;
        boolean isRunning = true;

        System.out.print("Enter the # of dice: ");
        numOfDice = scanner.nextInt();

        while (isRunning) {
            System.out.println("\n1. Roll the dice");
            System.out.println("2. Change the # of dice");
            System.out.println("3. Exit");
            System.out.println("*******************");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> {
                    if (numOfDice <= 0) {
                        System.out.println("# of dice must be greater than 0!");
                        break;
                    }

                    total = 0;
                    for (int i = 0; i < numOfDice; i++) {
                        int roll = random.nextInt(1, 7);
                        printDie(roll);
                        System.out.println("You rolled: " + roll);
                        total += roll;
                    }
                    System.out.println("Total: " + total);
                }

                case 2 -> {
                    System.out.print("Enter the new # of dice: ");
                    int newDice = scanner.nextInt();
                    if (newDice > 0) {
                        numOfDice = newDice;
                    } else {
                        System.out.println("# of dice must be greater than 0!");
                    }
                }

                case 3 -> isRunning = false;

                default -> System.out.println("Invalid choice!");
            }
        }

        System.out.println("Exiting program. Goodbye!");
        scanner.close();
    }

    static void printDie(int roll) {
        String[] dice = {
                """
            --------
           |        |
           |    ●   |
           |        |
            --------
            """,
                """
            --------
           |  ●     |
           |        |
           |     ●  |
            --------
            """,
                """
            --------
           |  ●     |
           |   ●    |
           |     ●  |
            --------
            """,
                """
            --------
           | ●   ●  |
           |        |
           | ●   ●  |
            --------
            """,
                """
            --------
           | ●   ●  |
           |   ●    |
           | ●   ●  |
            --------
            """,
                """
            --------
           | ● ● ●  |
           |        |
           | ● ● ●  |
            --------
            """
        };

        System.out.println(dice[roll - 1]);
    }
}
