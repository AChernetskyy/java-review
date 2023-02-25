package AppleInventoryTask;

import java.util.ArrayList;
import java.util.List;

public class CountApples {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(190, Color.GREEN));
        appleList.add(new Apple(230, Color.RED));
        appleList.add(new Apple(90, Color.RED));
        List<Apple> appleCount = filterApples(appleList, new GetWeight());
        List<Apple> appleColor = filterApples(appleList, new GetColor());
        System.out.println(appleCount+" -- heavy apples");
        System.out.println(appleColor+" -- green apples");
    }

    public static List<Apple>filterApples(List<Apple>inventory, Sort sort){
       List<Apple>sorted = new ArrayList<>();
        for (Apple apple: inventory) {
            if(sort.test(apple)){
                sorted.add(apple);
            }
        }
        return sorted;
    }
}
