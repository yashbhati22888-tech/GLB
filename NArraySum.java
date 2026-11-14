import java.util.Scanner;

public class NArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), 
        sum = 0;
        
    for (int i = 0; i < n; i++)
            sum += s.nextInt();
        System.out.println("Sum: " + sum);
        s.close();
    }
}