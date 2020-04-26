package Consumer;

import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {

        Consumer<Long> longConsumer = t -> System.out.println(10 * t);

        longConsumer.accept(2L);
        longConsumer.accept(3L);
        longConsumer.accept(4L);

    }
}
