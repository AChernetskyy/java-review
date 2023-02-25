import java.util.*;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Joe");
        map.put(2, "Gary");
        map.put(3, "Hill");
        System.out.println(map.get(1));
        System.out.println(findFirstUniqueChar("aaabxxxx"));
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        System.out.println(findCount((ArrayList<Integer>) list));

    }

    static Character findFirstUniqueChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count;
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }

    static Integer findCount(ArrayList<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int count;

        for (Integer num : arr) {
            if (map.containsKey(num)) {
                count = map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return null;
    }
}
