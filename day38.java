import java.io.*;
import java.lang.*;
import java.util.*;
public class day38
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next ();
        int freq[]=new int[256];
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(freq[i]==1)
            {
                System.out.print((char)i +" ");
            }
        }
    }
}