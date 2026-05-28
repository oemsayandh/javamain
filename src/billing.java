import java.util.Scanner;
public class billing {
    public static void main(String[] args)
    {
        double totalTip = 0;
        double totalBill = 0;
        double splitEach = 0;

        Scanner scanner = new Scanner(System.in);
        // total bill req
        System.out.println("how much is the total bill : ");
        double isTotal = scanner.nextDouble();
        // tip percwntage req
        System.out.println("how much is the tip percentage : ");
        double isTip = scanner.nextDouble();
        // n' bill spliting
        System.out.println("how many people are you splitting the bill with : ");
        int isPeople = scanner.nextInt();

        // total tip amount
        totalTip = isTotal * isTip / 100;
        System.out.println("total tip amonunt is " + totalTip + "$");
        // total bill include tip
        totalBill = totalTip + isTotal;
        System.out.println("total amount to be paid is " + totalBill + "$");

        // split
        splitEach = totalBill / isPeople;
        System.out.println("split for each pepole will be " + splitEach + "$");


        scanner.close();



    }
}
