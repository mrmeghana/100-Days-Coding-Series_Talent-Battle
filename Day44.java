import java.io.*;
import java.lang.*;
import java.util.*;
public class Day44
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int even=0,odd=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Number of even elements:\n"+even);
        System.out.println("Number of odd elements: \n"+odd);
    }
}