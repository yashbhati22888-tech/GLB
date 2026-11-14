public class factorial {
    
    public static long factorialIterative(int n) {
        long result = 1; // Using long to handle larger numbers
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        long result = factorialIterative(number);
        System.out.println("Factorial of " + number + " is: " + result); 
    }
}