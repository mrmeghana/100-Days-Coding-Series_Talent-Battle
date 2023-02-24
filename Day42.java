import java.io.*;
import java.lang.*;
import java.util.*;
public class Day42
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n=sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int flag=0;
        if(Arrays.equals(arr1,arr2))
        {
            flag=1;
        }
        if(flag==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}