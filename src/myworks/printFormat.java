public class printFormat {
    public static void main(String[] args){

        String cName = "Tom";
        char cGender = 'M';
        double cHeight = 91;
        String cisSpecies = "Domestic Shorthair Cat";
        int cAge = 7;
        boolean cReal = false ;
        String mName = "Jerry";
        char mGender = 'M';
        double mHeight = 10.5;
        String misSpecies = "House mouse";
        int mAge = 5;
        boolean mReal = false;
        //printf()is used to formAt output
        //%[flag '(' +-][width'_space_'][.precision'0-6'][special-characters s,d,f,c,b]
        System.out.printf("cat name is %s\n",cName);
        System.out.printf("cat Gender is %c\n",cGender);
        System.out.printf("cat age is %d\n",cAge);
        System.out.printf("cat Species is %s\n",cisSpecies);
        System.out.printf("cat height is %f\n",cHeight);
        System.out.printf("are they real %b\n",cReal);
        System.out.printf("mouse name is %s\n",mName);
        System.out.printf("Mouse gender is %c\n",mGender);
        System.out.printf("Mouse age is %d\n",mAge);
        System.out.printf("Mouse Species is %s\n",misSpecies);
        System.out.printf("mouse height is %f \n",mHeight);
        System.out.printf("are they real %b\n",mReal);
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("try the merge them in line \n");
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%s & %s is cat and mouse that is present in a cartoon that i have seen grown up\n" +
                "they have the height %s of %f and %s has the height of %f their a both common species of %s and %s\n " +
                "they are both %c and %c and the age of cat is %d and age of the mouse is %d\n",cName,mName,cName,cHeight,mName,mHeight,cisSpecies,misSpecies,cGender,mGender,cAge,mAge);
        //in this the double always comes in 91.000000 decimals will come with 6 zeroes
        //in that cas we use[%.precision] 0 -removez to 6 ,1-remove 2 to 6,......
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("editing decimal value with [.precision] using .0-6");
        System.out.println("--------------------------------------------------------------------------------------------------------\n");

        double istTall1 = 122.3;
        double istTall2 = 12.3;
        double istTall3 = 1.3;
        double istTall4 = 0.3;
        System.out.printf("%.1f\n %.1f\n %.2f\n %.1f\n",istTall1,istTall2,istTall3,istTall4);
        //above out will give the 112.3 and others not in a straight
        //like 120.3,'space'12.3,'space'1.30,'space'0.3,.........
        //going to use [width]. inthis
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("usage of [width'_space_'.]");
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        //putting "_space_"before. = % .1f
        System.out.printf("% .1f\n %.1f\n %.2f\n %.1f\n",istTall1,istTall2,istTall3,istTall4);
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("width manipulation\n");
        System.out.printf("% .1f\n % .1f\n %.2f\n % .1f\n",istTall1,istTall2,istTall3,istTall4);
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("[flag using '('+-");
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        //flag is used to represent positive and negative using'(' before '.'
        //it will display positive and wrap negative value in brackets'()'
        double isnumber1 = 300000000.333;
        double isnumber2 = -230000.333;
        double isnumber3 = -65300.333;
        int isnumber4 = -123345678;
        int isnumber5 = 434343;

        System.out.printf("\n%(.3f\n%(.3f\n%(.3f\n%(d\n%d",isnumber1,isnumber2,isnumber3,isnumber4,isnumber5);
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("adding comma for 1k places ");
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        //for making group of 1000 you can add ',' before '.'
        System.out.printf("\n%(,.3f\n%(,.3f\n%(,.3f\n%(,d\n%,(d",isnumber1,isnumber2,isnumber3,isnumber4,isnumber5);
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("padding using number\n");
        //use '0'with how many zero padding needed after '.' ="%.04d"= 00007
        System.out.println("use 0 and howmany zero needed for padding\n");
        int padNum1 =1234;
        int padNum2 =123;
        int padNum3 =12;
        System.out.printf("\n%04d\n%04d\n%04d\n",padNum1,padNum2,padNum3);
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("putting postive for numbers");
        // just put '+' before '.'
        System.out.printf("\n%(+.3f\n%(+.3f\n%(+.3f\n%(+d\n+%d\n",isnumber1,isnumber2,isnumber3,isnumber4,isnumber5);

        System.out.println("--------------------------------------------------------------------------------------------------------\n");

    }
}
