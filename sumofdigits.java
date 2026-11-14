import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        int sum = 0;
        
        // Loop to extract each digit
        while (num > 0) {
            sum += num % 10;
            num /= 10;  
        }
        
        System.out.println("Sum of digits: " + sum);
        s.close();
    }
}