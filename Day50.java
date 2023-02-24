import java.io.*;
import java.lang.*;
import java.util.*;
public class Day50
{
    public static int calc(int arr[], int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i]*arr[i];
        }
        return sum;
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
        int s=calc(arr,n);
        System.out.println(s);
    }
}