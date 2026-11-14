import java.util.Scanner;

public class ArrayConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        scanner.close();

        int[] result = new int[n + m];

        for (int i = 0; i < n; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < m; i++) {
            result[n + i] = b[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i == result.length - 1 ? "" : " "));
        }
    }
}