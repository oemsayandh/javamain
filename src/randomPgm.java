import java.util.Scanner;
import java.util.Random;



public class randomPgm {
    public static void main(String[] args){
        System.out.println("this is going to generate a random number and head and tail flip section  ");
        Random random = new Random();     // random will pull -2b +2b if leave empty()
        int number1;
        boolean coin;
        number1 = random.nextInt(0,10); // in this first is inclusive and second is exclusive that means no 10 only 0-9
        System.out.println("random number is " + number1);

        coin = random.nextBoolean();
        if(coin){
            System.out.println("heads");
        }
        else{
            System.out.println("tails");
        }

    }
}
