import java.io.*;
import java.util.*;
import java.lang.*;
public class Day61
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T--!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int t=a+b;
            if(t<3)
            {
                System.out.println("1");
            }
            else if(t>=3 && t<=10)
            {
                System.out.println("2");
            }
            else if(t>=11 && t<=60)
            {
                System.out.println("3");

            }
            else
            {
                System.out.println("4");
            }
        }
    }
}