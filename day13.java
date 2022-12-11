import java.io.*;
import java.lang.*;
import java.util.*;
public class day13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n>0)
        {
            sum=n*(n+1)/2;
            System.out.println(sum);
        }
    }
}