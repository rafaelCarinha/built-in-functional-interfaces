package Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class ExampleReal3 implements Runnable{

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExampleReal3());
        t1.start();

    }

    @Override
    public void run() {

        //Supplier<LocalDateTime> ldt1 = () -> LocalDateTime.now();
        Supplier<LocalDateTime> ldt1 = LocalDateTime::now;

        System.out.println("Thread Start Time: " + ldt1.get());

        try {
            Thread.currentThread().sleep(10000); //10secs
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printSomething(ldt1);

    }

    void printSomething(Supplier<LocalDateTime> ldt) {

        System.out.println("Thread End time: " + ldt.get());
    }
}
