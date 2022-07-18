package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Person extends Object {
    private String name;
    private int age;
    public static int count;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
    // public boolean equals(Object person) {
    // Person person1 = (Person) person;
    // return this.name.equals(person.name);
    // }

    // @Override
    // public Object toString(int age){
    // return "name: " + name +"\n"+ " age " + age;
    // }

    // @Override
    // public String toString() {
    // return "Person{" +
    // "name='" + name + '\'' +
    // ", age=" + age +
    // '}';
    // }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String test() {
        return "OK";
    }

    String test(int a) {
        return "OK";
    }
}
