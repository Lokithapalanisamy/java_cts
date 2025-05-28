import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> studentMap = new HashMap<>();

        System.out.println("Enter student IDs and names (type -1 to finish):");
        while (true) {
            try {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                if (id == -1) break;
                scanner.nextLine(); // Clear buffer
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                studentMap.put(id, name);
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); // Clear buffer
            }
        }

        System.out.print("\nEnter an ID to look up: ");
        try {
            int lookupId = scanner.nextInt();
            String foundName = studentMap.get(lookupId);
            if (foundName != null) {
                System.out.println("Student found: " + foundName);
            } else {
                System.out.println("No student found with ID " + lookupId);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        }
    }
}