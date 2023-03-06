import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        String str = "**********";
        String[] arr = {"Joe", "Mike", "Sue"};
        Stream<String> streamArr = Arrays.stream(arr);
        streamArr.forEach(System.out::println);

        //Filter
        System.out.println(str);
        TestData.testList.stream().filter(x -> x % 3 == 0).forEach(System.out::println);
        TestData.testList.stream().filter(v ->v>10).distinct().forEach(System.out::println);

        //Limit
        System.out.println(str);
        TestData.testList.stream().sorted().limit(1).forEach(System.out::println);

        //Skip
        System.out.println(str);
        TestData.testList.stream().skip(TestData.testList.size()-1).forEach(System.out::println);

        //Map
        System.out.println(str);
        TestData.testList.stream().filter(x-> x>100).map(x->x*200).forEach(System.out::println);
    }
}
