import java.util.Scanner;

public class EvenPositionDigitSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        int sum = 0;
        int p = 1; 
        
        while (num > 0) {
            int digit = num % 10;
            
            if (p % 2 == 0) {
                sum += digit;
            }
            
            p++;  
            num /= 10;   
        }
        
        System.out.println("Sum of digits at even positions: " + sum);
        s.close();
    }
}