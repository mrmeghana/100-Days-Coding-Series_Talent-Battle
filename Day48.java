import java.io.*;
import java.lang.*;
import java.util.*;
public class Day48
{
    public static int removedup(int arr[],int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j;

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
        int length = arr.length;  
        length = removedup(arr, length);
        for(int i=0;i<length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
