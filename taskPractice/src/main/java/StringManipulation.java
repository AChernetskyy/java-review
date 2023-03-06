import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringManipulation {
    public static void main(String[] args) {
        System.out.println(sumOfString("123abcsd"));
        System.out.println(validPassword("240784Ac"));
    }

    /*
    Return total sum of int in string
     */
    public static int sumOfString(String str) {
        int total = 0;

        for (Character ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                total += Integer.parseInt("" + ch);
            }
        }
        return total;
    }
    /*
      Task verify and return valid password
     */
    public static Boolean validPassword(String str){
        String lowercase = "(.*[a-z]*.)";
        String uppercase = "(.*[A-Z]*.)";
        String number = "(.*[0-9]*.)";
        String specialchracters = "(.*[-/,:-@!]*.)";

        boolean hasLower = str.matches(lowercase),
                hasUpper = str.matches(uppercase),
                hasDigit = str.matches(number),
                hasSpecail = str.matches(specialchracters),
                valid = false;
        if(str.length()>6 && !str.contains(" ")){
            if(hasLower && hasUpper && hasDigit && hasSpecail){
                valid = true;
            }
        }
return valid;
    }

}
