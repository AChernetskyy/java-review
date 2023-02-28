package doble_colon_operator.class_reference;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class API {
    public static void main(String[] args) {


        System.out.println(findFrequency("AAAABBBBBBbbbbb"));
        System.out.println(equalString("boy", "Boy"));
        System.out.println(removeDuplicateValues("aaaabbbbCCCCCDDDDDDkkkkk"));
        System.out.println(removeExtraSpaces("a   hhh  aa llll "));
        System.out.println(uniqueCharacters("Anntoom"));
        List<Integer> list = Arrays.asList(3,6,7,8,3,2);
        list.sort(Comparator.reverseOrder()); //TODO: Compare array list in descending order
        System.out.println(list);
        System.out.println(randomEmail(254));
        System.out.println(list.stream().anyMatch(x -> x > 3));
    }

    /*
            Task: find the frequency of characters
             */
    public static String findFrequency(String str) {
        Map<Character, Integer> total = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if (total.containsKey(ch)) {
                int charCount = total.get(ch);
                total.put(ch, charCount + 1);
            } else {
                total.put(ch, 1);
            }

        }
        return total.toString();
    }

    /*
    Task-->Check if two strings are equal.
     */
    public static boolean equalString(String str1, String str2) {

        char[] arr1 = str1.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static String removeDuplicateValues(String str) {

        return new HashSet<String>(Arrays.asList(str.toLowerCase().trim().split(""))).toString();
    }

    /*
    Task-->> remove all extra spaces
     */
    public static String removeExtraSpaces(String str) {

        return str.trim().replaceAll("\\s+", " ");
    }

    /*
    Task find unique characters and return as a String
     */

    public static String uniqueCharacters(String str) {
        List<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        String newStr = "";
        for (String each : arr) {
            newStr += (Collections.frequency(arr, each) == 1) ? each : "";
        }
        return newStr;
    }

    public static String randomEmail(int num){

        return RandomStringUtils.random(num,true, true).concat("@gmail.com");

    }


}
