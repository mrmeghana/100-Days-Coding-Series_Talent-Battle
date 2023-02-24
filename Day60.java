import java.io.*;
import java.lang.*;
import java.util.*;
public class Day60
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T--!=0)
        {
        int A;
        int rain=0;
        int sun=0;
        for(int i=0;i<7;i++)
        {
            A=sc.nextInt();
            if(A==0)
            {
                rain++;
            }
            else{
                sun++;
            }
        }
        if(rain>=sun)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
        }
        
    }
}