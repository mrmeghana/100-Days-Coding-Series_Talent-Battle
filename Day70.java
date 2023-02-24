import java.io.*;
import java.lang.*;
import java.util.*;
public class Day70
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<1;i++)
        {
            int j,last;
            last=arr[n-1];
            for(j=n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}