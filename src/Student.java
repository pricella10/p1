import java.util.Scanner;
public class Student {
    public static void avg(int n,int g[])
    {
        float avg;
        float s=0;
        for(int i=0; i<n; i++)
        {
            s += g[i];
        }
        avg = s / n;
        System.out.println("The Average is :"+" "+avg);
    }
    public static void min(int n,int g[])
    {
        int min = g[0];
        for(int i=0; i<n; i++)
        {
            if(min > g[i])
                min = g[i];
        }
        System.out.println("The Minimum is :"+" "+min);
    }
    public static void max(int n,int g[])
    {
        int max = g[0];
        for(int i=0; i<n; i++)
        {
            if(max < g[i])
                max = g[i];
        }
        System.out.println("The Maximum is :"+" "+max);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int g[] = new int[n];
        for(int i=0; i<n; i++)
        {
            g[i] = in.nextInt();
        }
        System.out.println("Enter no.of Students:"+n);
        for(int i=0; i<n; i++)
        {

            System.out.println("Enter the grade for student "+i+": "+g[i]);

        }
        avg(n,g);
        min(n,g);
        max(n,g);


    }
}
