import java.util.Scanner;

public class PalindromeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the upper limit (N): ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < n; i++) {
            int original = i;
            int reversed = 0;

            for (int temp = i; temp != 0; temp /= 10) {
                reversed = reversed * 10 + temp % 10;
            }

            if (original == reversed) {
                System.out.print(original + " ");
            }
        }
    }
}