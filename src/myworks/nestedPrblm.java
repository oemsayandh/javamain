import java.util.Scanner;

public class nestedPrblm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctAccNum = "1234";
        String acNum;
        double balance = 100000;

        System.out.println("Enter account number:");
        acNum = scanner.next();

        // First condition: check account number
        if (acNum.equals(correctAccNum)) {

            System.out.println("Account verified ");
            System.out.println("Current balance: " + balance);

            System.out.print("Enter amount to withdraw: ");
            double withdraw = scanner.nextDouble();

            // Second condition: valid amount
            if (withdraw > 0) {

                // Third condition: sufficient balance
                if (balance >= withdraw) {
                    balance -= withdraw;
                    System.out.println("Withdrawal successful ");
                    System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println(" Insufficient balance");
                }

            } else {
                System.out.println(" Invalid withdrawal amount");
            }

        } else {
            System.out.println(" Invalid account number");
        }

        scanner.close();
    }
}