import java.io.*;
import java.util.*;
import java.lang.*;
public class Day58
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T--!=0)
        {
            int K=sc.nextInt();
            int X=sc.nextInt();
            System.out.println(K-X);
        }

    }
}