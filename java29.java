import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordsExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 20)
        );

        System.out.println("All people:");
        people.forEach(System.out::println);

        List<Person> adults = people.stream()
                .filter(p -> p.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("\nAdults:");
        adults.forEach(System.out::println);
    }
}