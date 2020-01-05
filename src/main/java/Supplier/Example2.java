package Supplier;

import java.util.function.Supplier;

public class Example2 {

    public static void main(String[] args) {

        Supplier<User> userSupplier1 = () -> new User(18, "John");
        printUserSupplier(userSupplier1);

        User user = new User(16, "Katy");
        printUser(user);

    }

    static void printUserSupplier(Supplier<User> userSupplier) {
        System.out.println(userSupplier.get());
    }

    static void printUser(User user) {
        System.out.println(user);
    }



}
