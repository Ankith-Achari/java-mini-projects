import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){

        //Java Banking Program
        System.out.println("********************");
        System.out.println("BANKING PROGRAM");
        System.out.println("********************");

        //Declare Variables
        double balance=0;
        int choice;
        boolean isRunning = true;
        while (isRunning){
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************");

            System.out.print("Enter a choice(1-4): ");
            choice = scanner.nextInt();
            System.out.println("********************");

            switch (choice){
                case 1-> showBalance(balance);
                case 2-> {
                    balance+=deposit();
                    System.out.printf("Balance: Rs %.2f\n",balance);
                    System.out.println("********************");
                }
                case 3-> {
                    balance=withdraw(balance);
                    System.out.printf("Balance: Rs %.2f\n",balance);
                    System.out.println("********************");
                }
                case 4-> isRunning =false;
                default -> System.out.println("Invalid Choice!!!!");
            }

        }
        System.out.println("Thank You....Have a nice Day!!!");
        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Balance: Rs %.2f\n",balance);
        System.out.println("********************");
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount to deposit: ");
        amount = scanner.nextDouble();
        if (amount<=0){
            System.out.println("Amount can't be negative or zero!!!");
            System.out.println("********************");
            return 0;
        }
        else
            return amount;
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount to withdraw: ");
        amount = scanner.nextDouble();
        if (amount>balance){
            System.out.println("Insufficient Fund!!!");
            return balance;
        }
        else if (amount < 0) {
            System.out.println("Amount can't be negative!!!");
            return balance;
        }
        else
            return balance-amount;
    }
}
