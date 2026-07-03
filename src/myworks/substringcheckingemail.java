import java.util.Scanner;

public class substringcheckingemail {
    public static void main(String[] args){

        String email;
        String userName;
        String Domain;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter email address ");

        email = scanner.nextLine();
        if(email.contains("@")){
            // sub String usage """""""""""""""""""""""""""""""""""""""
            userName = email.substring(0,email.indexOf("@"));
            Domain = email.substring(email.indexOf("@")+1);
            System.out.println("username is " + userName );
            System.out.println("Domain is " + Domain);
        }
        else {
            System.out.println("not valid input");
        }

        scanner.close();
    }
}
