package OrangeInventoryTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestOrange {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(Orange.builder().weight(300).color(Color.RED).build());
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(400).color(Color.YELLOW).build());

       // OrangeFilter<Orange> getColor = orange -> "A " + (orange.getWeight() < 150 ? "Light" : "Heavy") + " " + orange.getColor() + " Orange";
        //Implementation by using Java ready interfaces -->Function
        Function<Orange, String> getColor = orange -> "A " + (orange.getWeight() < 150 ?"Light" : "Heavy") + " " + orange.getColor() + " Orange";
        formatedInventory(inventory, getColor);

        //OrangeFilter<Orange> getWeight = orange -> "An orange of "+orange.getWeight()+" g";
        //Implementation by using Java ready interfaces-->Function
        Function<Orange, String> getWeight = orange -> "An orange of "+orange.getWeight()+" g";
        formatedInventory(inventory, getWeight);

    }

    public static void formatedInventory(List<Orange>list, Function filter){
        for (Orange orange: list) {
            System.out.println(filter.apply(orange));
        }
    }
}
