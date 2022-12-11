import java.io.*;
import java.lang.*;
import java.util.*;
public class Day21
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int r,sum=0;
        while(num>0)
        {
            r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}