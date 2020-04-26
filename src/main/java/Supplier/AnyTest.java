package Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class AnyTest implements Runnable{

    public static void main(String[] args) {


        Thread t1 = new Thread(new AnyTest());
        t1.start();


    }

    static <T> T printSomething(Supplier<T> something) {

        T type = something.get();

        if (type instanceof LocalDateTime) {
            System.out.println("Do something with Local Date Time");
        }

        System.out.println("Thread end time: "+ type);

        return type;

    }


    @Override
    public void run() {
        Supplier<LocalDateTime> ldt = () -> LocalDateTime.now();
        System.out.println("Thread start time: "+ ldt.get());

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printSomething(ldt);
    }
}
