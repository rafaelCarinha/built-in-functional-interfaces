package Supplier;

import model.User;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ExampleReal {

    public static <T> void doSomething(Supplier<T> something) {

        System.out.println(something.get());

    }

    public static void main(String[] args) {

        Supplier<LocalDate> date = LocalDate::now;

        Supplier<Double> longSupplier = () -> Math.random();

        Supplier<User> userSupplier = () -> new User(38, "Rafael");

        doSomething(date);
        doSomething(longSupplier);
        doSomething(userSupplier);

    }
}
