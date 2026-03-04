package ClassStreamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();

        System.out.print("How many people do you want to enter: ");
        int people = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < people; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter city: ");
            String city = scanner.nextLine();

            Person person = new Person(name, age, city);
            peopleList.add(person);
        }

        //  Group by age
        Map<Integer, List<String>> groupByAge =
                peopleList.stream()
                        .collect(Collectors.groupingBy(
                                Person::getAge,
                                Collectors.mapping(Person::getName, Collectors.toList())
                        ));

        System.out.println("\n--- Grouped by Age ---");
        groupByAge.forEach((a, names) ->
                System.out.println("Age " + a + " --> " + names)
        );

        // Group by city
        Map<String, Long> groupByCity =
                peopleList.stream()
                        .collect(Collectors.groupingBy(
                                Person::getCity,
                                Collectors.counting()
                        ));

        System.out.println("\n--- Grouped by City ---");
        groupByCity.forEach((c, count) ->
                System.out.println(c + " --> " + count + " people")
        );

        //  BONUS
        if (peopleList.size() >= 2) {

            System.out.print("\nDo you want to change the second person's name? (yes/no): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {

                System.out.print("Enter the new name: ");
                String newName = scanner.nextLine();

                peopleList.get(1).setName(newName);

                System.out.println("Name updated successfully!");
                System.out.println("Updated Person: " + peopleList.get(1));
            } else {
                System.out.println("No changes made.");
            }

        } else {
            System.out.println("\nNot enough people to change the second person.");
        }

        scanner.close();
    }
}