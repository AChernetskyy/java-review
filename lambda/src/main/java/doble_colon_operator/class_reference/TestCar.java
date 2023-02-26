package doble_colon_operator.class_reference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestCar {
    public static void main(String[] args) {

        //Zero argument
        Supplier<Car>c1 = ()-> new Car();
        c1.get().setModel("GMC");
        System.out.println(c1.get().getModel());

        Supplier<Car>c2 = Car::new;
        c2.get().getModel();

        //One argument

        Function<Integer, Car> f1 = x->new Car(x);
        Car bmw = f1.apply(1999);
        System.out.println(bmw.getYear());

        Function<String, Car> f2 = Car::new;
        Car bmw2 = f2.apply("Ford");
        System.out.println(bmw2.getModel());

        //Two argument constractor

        BiFunction<String, Integer, Car> f3 = Car::new;
        Car honda = f3.apply("Honda",2007);
        System.out.println(honda.getModel());

    }
}
