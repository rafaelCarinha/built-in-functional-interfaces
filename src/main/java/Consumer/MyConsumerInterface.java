package Consumer;

import Supplier.User;

import java.util.function.Consumer;

public interface MyConsumerInterface extends Consumer<User>{

    static void sayHello(User user) {
        System.out.println("Hello " + user.getName());
    }

    static void tellAge(User user) {
        System.out.println("Your age is: " + user.getAge());
    }

}
