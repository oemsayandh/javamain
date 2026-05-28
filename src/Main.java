import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String name = ("area") ;
        double isHeight = 0;
        double isWidth = 0;
        double isArea = 0;
        Scanner scanner = new Scanner(System.in);
        // area option fro testingnboolin
        System.out.println("enter the function :");
        boolean String = scanner.hasNextBoolean();
        if(String){
            System.out.println("okey ");}
        else{
            System.out.println("wrong function");
        }

        System.out.println("enter height : ");
        double Height = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("enter width : ");
        double Width = scanner.nextDouble();
        scanner.nextLine();

        isArea = Height * Width ;
        System.out.println("area is " + isArea + " " + "cm");
        System.out.println("is " + isWidth);



        scanner.close();
    }

}
