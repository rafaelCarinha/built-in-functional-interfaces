package Supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Example1 {

    public static void main(String[] args) {

        // Prints a date
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        System.out.println(s1.get());
        System.out.println(s2.get());

        //Prints an empty StringBuilder
        Supplier<StringBuilder> sb1 = StringBuilder::new;
        Supplier<StringBuilder> sb2 = () -> new StringBuilder();
        System.out.println(sb1.get());
        System.out.println(sb2.get());

        // This function returns a random value.
        Supplier<Double> randomValue1 = Math::random;
        Supplier<Double> randomValue2 = () -> Math.random();
        // Print the random value using get()
        System.out.println(randomValue1.get());
        System.out.println(randomValue2.get());


    }
}
