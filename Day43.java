import java.io.*;
import java.lang.*;
import java.util.*;
public class Day43
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                a++;
            }
            if(arr[i]%2!=0)
            {
                b++;
            }
        }
        if(a==n)
        {
            System.out.println("even");
        }
        else if(b==n)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("mixed");
        }

    }
}