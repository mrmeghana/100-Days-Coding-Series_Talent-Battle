import java.io.*;
import java.lang.*;
import java.util.*;
public class day4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive number");
        }
        else if(num<0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Neither positive nor negative");
        }
    }
}