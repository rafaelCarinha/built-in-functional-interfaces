package Consumer;

import java.util.function.Consumer;

public class ConsumerExample3 {

    public static void main(String[] args) {

        Long aLong = 2L;

        Consumer<Long> longConsumer = t -> System.out.println(10 * t);
        Consumer<Long> andThenConsumer = t -> System.out.println(aLong / 2);

        longConsumer
                .andThen(andThenConsumer)
                .accept(aLong);

        System.out.println(aLong);

    }
}
