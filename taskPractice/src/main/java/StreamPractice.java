import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        String spacing = "***********";
        /*
        Print number of characters for each word
         */
        TestData.words.stream().map(String::length).forEach(System.out::println);
        System.out.println(spacing);

        /*
        Task-->>Print the name of each dish less than 400 cal
         */
        DishData.dishList().stream().filter(dish -> dish.getCalories()<400).map(Dish::getName).forEach(System.out::println);
        System.out.println(spacing);

        /*
        Print the length of the name of each dish
         */
        DishData.dishList().stream().map(dish -> dish.getName().length()).forEach(System.out::println);
        System.out.println(spacing);

        /*
        Print three high caloric dishes name(>300)
         */
        DishData.dishList().stream().filter(dish -> dish.getCalories()>300).limit(3).map(Dish::getName).forEach(System.out::println);
        System.out.println(spacing);

        /*
        Print all dishes name that are below 400 calories in sorted order
         */
        DishData.dishList().stream().filter(dish -> dish.getCalories()<400).sorted(Comparator.comparing(Dish::getCalories)).map(Dish::getName).forEach(System.out::println);
        System.out.println(spacing);
    }
}
