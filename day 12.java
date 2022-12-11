import java.io.*;
import java.lang.*;
import java.util.*;
public class day12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp;
        int sum=0;
        while(num!=0)
        {
            temp=num%10;
            sum=sum+temp;
            num=num/10;
        }
        System.out.println(sum);
    }
}