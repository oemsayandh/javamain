import java.util.Locale;

public class stringmethods {
    public static void main(String[] args){
        String name = "sponge bob";
        String Name = "sponge bob";
//length of the string
        int length = name.length();

// to find the character of the position ,
// and use -1 to get crrct position because it counts from 0
        char letter = name.charAt(2-1);

//index finder for finding the postion of given letter in string
        int index = name.indexOf("p");

//index finder for finding the lastpostion of given letter in string
        int lastindex = name.lastIndexOf("b");

        //for correcting postion adding +1
        lastindex = lastindex+1;;

//replace letter
       name = name.replace("p","o");

//to full lower case
       // Name = Name.toLowerCase();
//to Full upper case
        Name = Name.toUpperCase();

//check if string is empty
        if(name.isEmpty()){
        }

//to checking is given string is equal for password and shits
        if(Name.equals(name)){
        }
       // ignore case sens with
        if(name.equalsIgnoreCase(Name)){

        }







        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);
        System.out.println(Name);
    }

}
