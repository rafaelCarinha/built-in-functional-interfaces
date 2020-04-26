package functional;

import java.util.function.Predicate;

public class FunctionalInterfaceCall {

    public static void main(String[] args) {

        FunctionalInterfaceExample<String> functionalInterfaceExample = (y) -> System.out.println(y);
        functionalInterfaceExample.doAnythingElse("Rafa");

        Predicate<String> pred = (x) -> x.equals("a");
    }
}
