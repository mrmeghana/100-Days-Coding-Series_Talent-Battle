import java.io.*;
import java.lang.*;
import java.util.*;
public class Day55
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            sum=sum+arr1[i]*arr2[i];
        }
        System.out.println(sum);
    }
}