import java.io.*;
import java.lang.*;
import java.util.*;
public class Day27
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int b=num;
        for(int i=1;i<=b;i++)
        {
           num++;
        }
        System.out.println(num);
    }
}