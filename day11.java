import java.io.*;
import java.lang.*;
import java.util.*;
public class day11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1;
        int fib=0;
        System.out.print(a+","+b);
        for(int i=2;i<num;i++)
        {
            fib=a+b;
            System.out.print(","+fib);
            a=b;
            b=fib;
        }
       
    }
}