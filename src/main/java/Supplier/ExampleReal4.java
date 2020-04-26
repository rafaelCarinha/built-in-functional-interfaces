package Supplier;

import model.User;

import java.util.function.Supplier;

public class ExampleReal4 implements Runnable{

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExampleReal4());
        t1.start();

    }

    @Override
    public void run() {

        Supplier<Double> db = Math::random;

        Supplier<StringBuffer> sb = () -> new StringBuffer("Test");

        Supplier<User> user = () -> new User("Rafael", 38);

        printSomething(db);
        printSomething(sb);
        printSomething(user);

    }

    <T> T printSomething(Supplier<T> ldt) {

        System.out.println(ldt.get());

        return ldt.get();
    }
}
