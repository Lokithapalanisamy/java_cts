import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        
        System.out.println("Before sorting: " + names);
        
        Collections.sort(names, (a, b) -> a.compareTo(b));
        
        System.out.println("After sorting: " + names);
    }
}