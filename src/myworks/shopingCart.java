import java.util.Scanner;

public class shopingCart {
    public static void main (String[] args)
    {
        String isItem;
        double price ;
        int quantity ;
        double isTotal = 0 ;

        System.out.println("These are the items available \n coffee apple\nbread notebook\nmilk chips");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name of the item ;");
        isItem = scanner.next();
        System.out.println("enter the price ;");
        price = scanner.nextDouble();
        System.out.println("enter quantity ;");
        quantity = scanner.nextInt();
        isTotal = quantity * price ;

        System.out.println("total for the "+ isItem +" & quantity of "+quantity+" is =" + isTotal +"$");

        scanner.close();









    }
}