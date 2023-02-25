package OrangeInventoryTask;

import java.util.ArrayList;
import java.util.List;

public class TestOrange {
    public static void main(String[] args) {
        List<Orange> inventory = new ArrayList<>();
        inventory.add(Orange.builder().weight(300).color(Color.RED).build());
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(400).color(Color.YELLOW).build());

        OrangeFilter<Orange> getColor = orange -> "A " + (orange.getWeight() < 150 ? "Light" : "Heavy") + " " + orange.getColor() + " Orange";
        formatedInventory(inventory, getColor);

        OrangeFilter<Orange> getWeight = orange -> "An orange of "+orange.getWeight()+" g";
        formatedInventory(inventory, getWeight);

    }

    public static void formatedInventory(List<Orange>list, OrangeFilter filter){
        for (Orange orange: list) {
            System.out.println(filter.input(orange));
        }
    }
}
