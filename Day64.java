import java.io.*;
import  java.util.*;
import java.lang.*;
public class Day64
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0)
    {
        String str=sc.next();
        if(str.contains("010") || str.contains("101"))
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println("Bad");
        }
    }
}
}