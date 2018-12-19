public class Factorial {
    public static void intFact(int n)
    {
        int f = 1;
        if( n == 0)
            System.out.println(1);
        for(int i=1; i<=n; i++)
        {
            f = f * i;
            System.out.println("The factorial of "+i+" is "+f);
        }

    }
    public static void main(String[] args)
    {
        int n = 20;
        System.out.println("Int factorials:");
        intFact(n);

    }
}
