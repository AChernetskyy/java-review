import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer>numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier): is used to create a collection using collector and save it to new ArrayList
        List<Integer>newList = numbers.stream().filter(x->x%2==0).collect(Collectors.toCollection(ArrayList::new));

        //.toMap(Function, Function) : returns a Collector interface that gathers the input data into the Map
        Map<String, Integer> dish = DishData.dishList().stream().collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dish);

        //.counting() : returns a Collector that counts the number of the elements
        Long num =   numbers.stream().filter(p->p%2==0).collect(Collectors.counting());

        //.summingInt(ToIntFunction) : returns a Collector with sum of integers value
       Long num1 =  DishData.dishList().stream().map(Dish::getCalories).collect(Collectors.counting());

       //.averagingInt(ToIntFunction) : returns average of the integers

       DishData.dishList().stream().collect(Collectors.averagingInt(Dish::getCalories));

       //.joining() : is used to join various elements of a character or string array into single object
        List<String> strList = Arrays.asList("John", "Gary", "Gill");
        strList.stream().collect(Collectors.joining());

        //.partitioningBy() : is used to partition a stream
        DishData.dishList().stream().collect(Collectors.partitioningBy(Dish::isVegetarian));

        //.groupingBy() : is used for grouping
        Map<Type, List<Dish>> dishType =   DishData.dishList().stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
    }
}
