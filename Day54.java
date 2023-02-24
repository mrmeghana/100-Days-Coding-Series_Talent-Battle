import java.io.*;
import java.lang.*;
import java.util.*;
public class Day54
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();

        }
        int n=sc.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    flag=1;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Not Disjoint");
        }
        else
        {
            System.out.println("Disjoint");
        }
    }
}