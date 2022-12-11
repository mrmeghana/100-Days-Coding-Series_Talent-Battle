import java.io.*;
import java.lang.*;
import java.util.*;
public class day20
{
    public static int isprime(int num)
    {
        int count=0;
        if(num==1)
        {
            return 0;
        }
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count>1)
            {
                return 0;
            }
        else
        {
            return 1;
        }
}
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=isprime(num);
        if(flag==1)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+ " is not a prime number");
        }
    }
}
