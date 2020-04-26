package Function;

import model.User;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        List<User> users = User.userListCreator();

        users.stream()
                .map(user -> func.apply(user))
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

    }

    static Function<User, String> func = user -> user.getName()+": " +user.getName().length();

}
