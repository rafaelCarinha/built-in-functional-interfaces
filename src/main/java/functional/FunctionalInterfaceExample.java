package functional;

@FunctionalInterface
public interface FunctionalInterfaceExample<T> {

    void doSomething(T t);

    default void doAnythingElse(T t) {
        this.doSomething(t);
        System.out.println("Say Something");
    }
}
