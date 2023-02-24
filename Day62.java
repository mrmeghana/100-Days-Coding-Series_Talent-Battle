import java.io.*;
import java.lang.*;
import java.util.*;
public class Day63
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T--!=0)
        {
            int N=sc.nextInt();
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int sum=Y*(N+1);
            if(sum>=X)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}