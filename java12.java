public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10: " + add(5, 10));
        System.out.println("Sum of 3.14 and 2.71: " + add(3.14, 2.71));
        System.out.println("Sum of 1, 2 and 3: " + add(1, 2, 3));
    }
}