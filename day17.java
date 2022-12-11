import java.io.*;
import java.util.*;
import java.lang.*;
public class day17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(num);
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(","+i);
            }
        }
    }
}