import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        Set<Student>mySet = new HashSet<>(); //No duplicates

        mySet.add(new Student(0, "Gary"));
        mySet.add(new Student(1, "Jary"));
        mySet.add(new Student(2, "Hary"));
        mySet.add(new Student(3, "Bary"));
        mySet.add(new Student(4, "Mary"));
        mySet.add(new Student(5, "Dary"));
        mySet.add(new Student(5, "Dary"));
        System.out.println(mySet);
        System.out.println(findDuplicateChar("Anton"));


    }

    /*
    Task--> Find first repeating char in a string
     */
    static Character findDuplicateChar(String a){
        Set<Character>charArr = new HashSet<>();
        for (Character ch: a.toCharArray()) {
            if(!charArr.add(ch)){
                return ch;
            }
        }
        return null;
    }
}
