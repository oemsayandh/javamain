import java.util.Scanner;
public class weightconverter {
    public static void main(String[] args) {
        //declare varibles

        double weight;
        double newWeight;
        int option;
        Scanner scanner = new Scanner(System.in);

        // choosing conversion
        System.out.print("choose option convert Kg to Lbs : 1 ");
        System.out.println("\nchoose option convert lbs to Kg: 2 ");
        option = scanner.nextInt();
        //get weight
        System.out.println("Please enter your weight");
        weight = scanner.nextDouble();
        //conversion equation 1*2.205 lbs to kg
        if (option == 1){
            newWeight = weight * 2.205;
            System.out.println("converted weight is " + newWeight);
        }
        else if (option == 2){
            newWeight = weight / 2.205;
            System.out.printf("converted weight is %.2f", newWeight);
        }
        else{
            System.out.println("invalid option");
        }
    }
}
