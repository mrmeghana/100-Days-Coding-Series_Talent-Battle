import java.io.*;
import java.lang.*;
import java.util.*;
public class Day56
{
    public static boolean check(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            while(arr[i]%2==0)
            {
                arr[i]=arr[i]/2;
            }
            while(arr[i]%3==0)
            {
                arr[i]=arr[i]/3;
            }
            if(arr[i]!=arr[0])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(check(arr,n))
        {
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}