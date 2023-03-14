import org.apache.commons.lang3.ArrayUtils;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewPractice {
    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("aaadddrrrtttiiiiiii"));
        System.out.println(reverseString("Anton"));
        System.out.println(isPalindrom("mam"));
        System.out.println(isSameString("jojo", "ojoo"));
        System.out.println(removeDuplicates("aaaabbbbsssddd"));
        System.out.println(uniqueCharacter("affffkjjj"));
        System.out.println(sumOfNumbers("123hkkk"));
        System.out.println(minValueArr(new Integer[]{1, 2, 3, 4, 5}));
        System.out.println(Arrays.toString(addTwoArr(new Integer[]{3, 4, 5, 6}, new Integer[]{4, 5})));
        System.out.println(Arrays.toString(addZeroToTheEnd(new Integer[]{0, 0, 9, 0, 3, 4, 5})));
        System.out.println(Arrays.toString(moveZeros(new Integer[]{0, 0, 9, 0, 3, 4, 5})));
        System.out.println(EvenOrOdd(4));
        List<Integer> primeNum = new ArrayList<>();
        for (int i = 2; i < 1000; i++) {
            if (isPrimeNumber(i)) primeNum.add(i);
        }
        System.out.println(repeatedNum(new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 5, 4))));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 5, 5, 11}, 10)));
        System.out.println(removeSpace("Anton   is    a great QA  "));
        System.out.println(isAnagram("iceman", "cinema"));
        fibinaciArr(0);
        findMissingNumber(new int[]{3,5,7,8});

    }

    public static String frequencyOfCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();


        for (Character ch : str.toCharArray()) {
            int count = 0;
            if (map.containsKey(ch)) {
                count = map.get(ch) + 1;
                map.put(ch, count);
            } else {
                map.put(ch, 1);
            }
        }
        return map.toString();
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static Boolean isPalindrom(String str1) {
        return new StringBuilder(str1).reverse().toString().equals(str1);
    }

    public static Boolean isSameString(String str1, String str2) {
        char[] arr = str1.toCharArray();
        char[] arr1 = str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr, arr1);
    }

    public static String removeDuplicates(String str) {

        return new LinkedHashSet<>(Arrays.asList(str.split(""))).toString().replaceAll("[,\\[\\]\\s]", "");
    }

    public static String uniqueCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        String newStr = "";
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character ch : map.keySet()) {
            if (map.get(ch) == 1) {
                newStr += ch;
            }
        }
        return newStr;
    }

    public static String uniqueCharacter2(String str) {
        String newStr = "";
        for (String each : str.split("")) {
            newStr += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";
        }

        return newStr;
    }

    public static int sumOfNumbers(String str) {
        int sum = 0;
        for (Character each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        return sum;
    }

    public static int maxValueArr(Integer[] arr) {
        return Stream.of(arr).reduce(Integer::max).get();
    }

    public static int minValueArr(Integer[] arr) {
        return Stream.of(arr).reduce(Integer::min).get();
    }

    public static Integer[] addTwoArr(Integer[] arr, Integer[] arr2) {
        return //ArrayUtils.addAll(arr, arr2);-->First solution
                Stream.concat(Stream.of(arr), Stream.of(arr2)).toArray(Integer[]::new);//-->>Second solution
    }

    public static Integer[] addZeroToTheEnd(Integer[] arr) {
        List<Integer> zero = new ArrayList<>();
        List<Integer> nonzero = new ArrayList<>();
        for (Integer each : arr) {
            if (each == 0) {
                zero.add(each);
            } else {
                nonzero.add(each);
            }
        }
        List<Integer> newArr = new ArrayList<>();
        newArr.addAll(nonzero);
        newArr.addAll(zero);
        return newArr.toArray(Integer[]::new);


    }

    public static Integer[] moveZeros(Integer[] arr) {
        return Stream.of(arr).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
    }

    public static String EvenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static Integer factorial(Integer num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static Boolean isPrimeNumber(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static String repeatedNum(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer each : arr) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else map.put(each, 1);
        }
        map.entrySet().removeIf(entry -> entry.getKey() == 1);
        return map.toString();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
        }
        return null;
    }

    public static String removeSpace(String str) {
        return str.replaceAll("\\s+", " ");
    }

    public static Boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void fibinaciArr(int limit) {
        //Stream.iterate(new int[]{0,1}, each ->new int[]{each[1],each[0]+each[1]}).limit(limit).forEach(each -> System.out.print(each[0]+" ")); // without map
        Stream.iterate(new int[]{0, 1}, each -> new int[]{each[1], each[0] + each[1]}).limit(limit).map(n -> n[0]).forEach(System.out::println);//with map
    }

    public static void findMissingNumber(int[] arr) {
        //Arrays.sort(arr);
        int index = 0;
        for (int i = arr[index]; i < arr[arr.length-1]; i++) {
             if(arr[index]==i){
                 index++;
             }else System.out.println(i);
        }
    }


}
