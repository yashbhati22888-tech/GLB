public class PalindromeNum {
    public static void main(String[] args) {
        int n = 121;
        int original = n, r = 0;

        for (; n != 0; n /= 10) {
            r = r * 10 + n % 10;
        }

        System.out.println(original == r);
    }
}