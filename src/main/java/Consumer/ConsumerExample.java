package Consumer;


import model.User;

import java.util.List;
import java.util.stream.Collectors;

public class ConsumerExample {

    public static void main(String[] args) {

        List<User> userList = User.userListCreator();

        //userList.forEach(System.out::println);

        System.out.println("Filtered List");
        userList.stream().filter(user -> user.getAge()>50).peek(user -> System.out.println(user)).collect(Collectors.toList());

        System.out.println("Original List");
        userList.forEach(System.out::println);

    }
}
