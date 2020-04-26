package Supplier;

import model.User;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        List<User> people = Arrays.asList(
                new User("Mario", 27),
                new User("Luigi", 30),
                new User("Steve", 20)
        );

        Map<String, Integer> mapNameAge = people.stream()
                .collect(Collectors.toMap(
                        User::getName,
                        User::getAge)
                );

        Map<String, Integer> linkedMapNameAge = people.stream()
                .collect(Collectors.toMap(
                        User::getName,
                        User::getAge,
                        (u,v) -> { throw new IllegalStateException(String.format("Duplicate key %s", u)); },
                        LinkedHashMap::new
                ));

        if (true && true){
            System.out.println("Test");
        }

    }
}
