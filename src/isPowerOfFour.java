import java.util.Scanner;
public class isPowerOfFour {
    public static void power(int n)
    {
        if(n==0)
        {
            System.out.println("not power of 4");
        }
        while(n != 1)
        {
            if(n % 4 != 0)
                System.out.println("not power of 4");
            n /= 4;
        }
        System.out.println("is power of 4");
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        power(num);
    }
}
