package model;

import java.util.Arrays;
import java.util.List;

public class User {

    private Integer age;
    private String name;

    public User() {
    }

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static List<User> userListCreator() {

        return Arrays.asList(
                new User("Bob", 31),
                new User("Lisa", 20),
                new User("Mohamed", 50),
                new User("Andrew", 51));

    }
}
