import java.io.*;
import java.lang.*;
import java.util.*;
public class Day71
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        while(t-->0){
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int cnt=n/2;
        while(cnt>0 && a[cnt-1]==a[cnt])
        {
            cnt--;
        }
        System.out.println(n-cnt);
        }
    }
}