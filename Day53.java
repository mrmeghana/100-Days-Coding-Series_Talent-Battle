import java.io.*;
import java.util.*;
import java.lang.*;
public class Day53
{
    public static int MaxSubArraySum(int arr[], int n)
    {
        int ans=arr[0];
        for(int i=0;i<n;i++)
        {
            int mul= arr[i];
            for (int j = i + 1; j < n; j++)
            {
                ans = Math.max(ans,mul);
                mul=mul * arr[j];
            }
            ans = Math.max(ans,mul);
        }
        return ans;
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
        System.out.println(MaxSubArraySum(arr,n));
    }
}