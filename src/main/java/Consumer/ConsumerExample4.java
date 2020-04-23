package Consumer;

import Supplier.User;

public class ConsumerExample4 {

    public static void main(String[] args) {

        MyConsumerInterface myConsumerInterface = MyConsumerInterface::sayHello;

        myConsumerInterface
                .andThen(MyConsumerInterface::tellAge)
                .accept(new User("Rafa", 38));
    }
}
