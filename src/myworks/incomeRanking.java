import java.util.Scanner;
public class incomeRanking {
    public static void main(String[] args){

        int yearlyIncome;
        String isName;

        System.out.println("This program will tell you where in the income ranking you are in dollar standard $ ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name ; ");
        isName = scanner.next();

        System.out.println("enter your yearly income in dollars = ");
        yearlyIncome = scanner.nextInt();
        if(isName.isEmpty()){
            System.out.println("pls enter name");
        }
        else{
            System.out.println("thank you for entering "+isName);
        }


        if( yearlyIncome>=250300) {
            System.out.println("Top 1%   The global economic elite (roughly 56 million adults).");
        }
        else if (yearlyIncome>=145000)
        {
            System.out.println("top 3% Highly concentrated in upper-income professionals in Western nations.");
        }
        else if (yearlyIncome>=105000)
        {
            System.out.println("5% Upper middle class by global standards.");
        }
        else if (yearlyIncome>= 78000)
        {
            System.out.println("8% Entering the boundary of the top global decile.");
        }
        else if (yearlyIncome>=65000)
        {
            System.out.println("10% You earn more than 90% of the entire global population.");
        }
        else if (yearlyIncome>=35000)
        {
            System.out.println("20% The threshold of the upper-middle global tier.");
        }
        else if (yearlyIncome>=21000)
        {
            System.out.println("30% Solidly in the Global Middle Class.");
        }
        else if (yearlyIncome>=11500)
        {
            System.out.println(" 40% Above the exact median of the world's population");
        }
        else if (yearlyIncome>= 5100)
        {
            System.out.println(" 50% The exact halfway point of global adult income.");
        }
        else if (yearlyIncome>=3800)
        {
            System.out.println("60% Moving into developing economic baselines.");
        }
        else if (yearlyIncome>=2500)
        {
            System.out.println("70% Lower global income brackets.");
        }
        else if (yearlyIncome>=1400)
        {
            System.out.println("80% Deeply affected by global poverty lines.");
        }
        else if (yearlyIncome>=600)
        {
            System.out.println("90% Near the baseline of the world's lowest earners");
        }
        else
        {
            System.out.println("Everyone with any measurable baseline income or subsistence.");
        }

    }
}
