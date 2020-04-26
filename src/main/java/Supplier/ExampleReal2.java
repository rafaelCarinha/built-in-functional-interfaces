package Supplier;

import java.time.LocalDateTime;

public class ExampleReal2 implements Runnable{

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExampleReal2());
        t1.start();

    }

    @Override
    public void run() {

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("Thread Start Time: " + ldt1.toString());

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printSomething(ldt1);

    }

    void printSomething(LocalDateTime ldt) {
        System.out.println("Thread End time: " + ldt.toString());
    }
}
