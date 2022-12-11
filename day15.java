import java.io.*;
import java.lang.*;
import java.util.*;
public class day15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int fact,lastdig;
        n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            i=1;
            fact=1;
            lastdig=n%10;
            while(i<=lastdig)
            {
                fact=fact*i;
                i++;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("Not a strong number");
        }
    }
}