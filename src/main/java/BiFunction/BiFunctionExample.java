package BiFunction;

import model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BiFunctionExample {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>(User.userListCreator());
        users.add(new User("Bob", 18));

        Map<Integer, String> usersMap =
                users.stream()
                        .collect(Collectors.toMap(user -> user.getAge(), user -> user.getName()));


        BiFunction<Integer, String, String> biFunction = (key, value) ->
                value + ":" + key+ ": " +Collections.frequency(usersMap.values(), value)+  " time(s)";

        usersMap.forEach((k, v) -> System.out.println(biFunction.apply(k, v)));
    }

}
