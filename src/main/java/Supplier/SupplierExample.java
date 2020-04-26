package Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample implements Runnable{

    public static void main(String[] args) {

        Thread t1 = new Thread(new SupplierExample());
        t1.start();


    }

    static <T> T printAnything(Supplier<T> anything) {

        T type = anything.get();

        if (type instanceof LocalDateTime){
            System.out.println("Type is a LocalDateTime");
        }

        System.out.println("Thread end time: " +type);

        return type;
    }

    @Override
    public void run() {
        //Supplier<Double> random = Math::random;
        //Supplier<User> user = () -> new User(30, "Bob");

        Supplier<LocalDateTime> ldt = () -> LocalDateTime.now();
        System.out.println("Thread start time: " + ldt.get());

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printAnything(ldt);
        //printAnything(random);
        //printAnything(user);
    }
}
