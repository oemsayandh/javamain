import java.sql.SQLOutput;
import java.util.Scanner;
public class ternery_oprator {

    public static void main(String[] args){
        double taxZone ;
        double income ;
        double afterTax;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter income here rs;");
        income = scanner.nextDouble();
        //terynery opertor ''''''''''''''''''''''''''''''''''''''''''
//varibale = (condition) ? true : flase; use highest to lowest bettr''''''''''''''''''''''''''''''''''''''''''''''
        taxZone = (income > 1200000) ? 15 :
                  (income > 800000) ? 10 :
                  (income > 400000) ? 5 : 0;

        System.out.printf("for %,.2f \n" , income  );
        System.out.println(taxZone + "%");

        afterTax = income - taxZone / 100 * income;
        System.out.printf("after tax is  %,.2f", afterTax);


        scanner.close();


    }
}
