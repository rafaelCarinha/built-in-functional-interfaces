package Supplier;

import model.User;

import java.util.function.Supplier;

public class SupExample implements Runnable{

    public static void main(String[] args) {

        Thread thread1 = new Thread(new SupExample());
        thread1.start();

    }

    static <T> T printSomething(Supplier<T> something) {

        T type = something.get();

        if (type instanceof User){
            ((User) type).setAge(39);
        }

        System.out.println(type);

        return type;

    }


    @Override
    public void run() {

        Supplier<User> user = () -> new User(38, "Rafael");

        printSomething(user);

    }
}
