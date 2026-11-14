import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer N: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (; n != 0; n /= 10) {
            sum += n % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}