package doble_colon_operator.class_reference;

import doble_colon_operator.Calculate;
import doble_colon_operator.Calculator;

import java.util.function.*;

public class Demo {
    public static void main(String[] args) {
        //Reference to a static method
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,35);

        //Reference to instance method
        Calculate m1 = (x,y) -> Calculator.multiply(x,y);
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::divide;
        m2.calculate(8,9);

        Calculate m3 = Calculator::multiply;
        m3.calculate(6,6);

        BiFunction<String,Integer,String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("Developer",6));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer",6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(50);


        BiFunction<MyClass,Integer,Double> v2 = MyClass::method;

        BiFunction<String,String,String> v3 = String::concat;
    }
}
