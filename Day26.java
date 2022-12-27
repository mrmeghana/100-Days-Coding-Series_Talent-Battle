import java.io.*;
import java.lang.*;
import java.util.*;
public class Day26
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int temp=0;
        for(int i =1;i<=N;i++)
        {
            int sum=(N-i);
            temp=temp+sum;
        }
        System.out.println(temp);
    }
}