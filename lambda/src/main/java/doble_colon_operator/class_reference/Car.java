package doble_colon_operator.class_reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    String model;
    int year;

    public Car(int year){
        this.year= year;
    }

    public Car(String s) {
        this.model = s;
    }
}
