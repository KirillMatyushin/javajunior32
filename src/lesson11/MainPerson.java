package lesson11;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 30);
        Person person1 = new Person("Elena", 25);
        System.out.println(person.equals(person1));

        // List<String> strings = new ArrayList<>();

        // List strings = new ArrayList();
        // strings.add(5);
        // strings.add("sdsds");
        // strings.add(new Person());
        // for (Object string : strings) {
        // }

        // System.out.println(person.toString());
        System.out.println(person);

        // String s = "hello";
        // String s1 = "hello";
        // String s2 = new String("hello");
        // System.out.println(s == s2);

        // Правила переопределения equals:
        // если a = b, b = c, то c = a
        // если a = b, то b = a
        // если a = b, то hashCode a = hashCode b, но не наоборот

        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        // Если Ивану 25:
        // 71029023
        // 2078269320
        // Если Ивану 30:
        // 71029028
        // 2078269320

        // Person.count;

        person.test(20);
    }
}
