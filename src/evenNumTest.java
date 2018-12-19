import java.util.Scanner;
public class evenNumTest {
    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isEven(n))

            System.out.println(n+" is even number");
        else
            System.out.println(n+" is not even number");



    }

}
