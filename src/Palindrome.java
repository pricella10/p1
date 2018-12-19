
import java.util.Scanner;

public class Palindrome {
    public static void reverse() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp, rem, rev=0;
        temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        reverse();
    }
}
