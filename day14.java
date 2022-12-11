import java.io.*;
import java.util.*;
import java.lang.*;
public class day14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        while(temp>0)
        {
            num=temp%10;
            
            temp=temp/10;
            System.out.print(num);
        }
    }
}