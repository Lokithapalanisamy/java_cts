public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;  // Multiplication before addition
        int result2 = (10 + 5) * 2; // Parentheses change order
        
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        
        // More complex example
        int a = 5, b = 10, c = 2;
        int complexResult = a + b * c / a - c % a;
        System.out.println("5 + 10 * 2 / 5 - 2 % 5 = " + complexResult);
    }
}