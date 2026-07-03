import java.util.Scanner;

public class Compund_intrest_calculator {
    public static void main(String[] args) {
        double  Principle;
        double Rate;
        int years;
        int compoundYearly;
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the amount to be deposited = ");
        Principle = scanner.nextDouble();

        System.out.printf("enter the interest rate = ");
        Rate = scanner.nextDouble()/100;// need for the computation for making divisble by 100

        System.out.printf("Enter the compound period 4,2,1  = ");
        compoundYearly = scanner.nextInt();

        System.out.printf("Enter the number of years = ");
        years = scanner.nextInt();
        // equation for compound calc is  \(A = P*(1 +r/n)^nt)
        amount = Principle * Math.pow(1+Rate/compoundYearly, compoundYearly*years);

        System.out.printf("amount after compounding is ₹%,.1f\n", amount);

        scanner.close();


    }
}
