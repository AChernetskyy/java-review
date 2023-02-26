package doble_colon_operator;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class TestCalculator {
    public static void main(String[] args) {
        Calculate c1 = (x, y) -> Calculator.findSum(x, y);// In this instance we are using custom interface -->> Calculate
        c1.calculate(4, 6);

        BiConsumer<Integer, Integer> b1 = (x, y) -> Calculator.findSum(x, y);//In this instance we are using java ready interface -->> BiConsumer
        b1.accept(2, 3);

        //Reference to a static method
        Calculate c2 = Calculator::findSum;
        c2.calculate(6, 7);

        BiConsumer<Integer, Integer> b2 = Calculator::multiply;
        b2.accept(9, 9);

        //Reference to instance method
        Calculate c3 = (x, y) -> new Calculator().divide(x, y);
        c3.calculate(12, 6);
        Calculator obj = new Calculator();

        Calculate c4 = obj::divide;
        c4.calculate(5, 8);

        Calculate c5 = new Calculator()::divide;
        c5.calculate(1, 9);

        BiFunction<String, Integer, String> fn = String::substring;
        System.out.println(fn.apply("Jackingson", 1));

        Consumer<Integer> display = System.out::println;
        display.accept(8);

    }
}
