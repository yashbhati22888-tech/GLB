public class ReverseNu{
    
    public static int reverseWithWhile(int n) {
        int reversed = 0;
        
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10; 
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        int number = 9876;
        System.out.println("Reversed: " + reverseWithWhile(number)); 

    }
}