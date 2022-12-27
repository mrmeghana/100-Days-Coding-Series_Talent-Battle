import java.io.*;
import java.lang.*;
import java.util.*;
public class day37
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int freq[]=new int[str.length()];
        char strnew[] = str.toCharArray(); 
        for(int i=0;i<str.length();i++)
        {
            freq[i]=1;
            for(int j=i+1;j<str.length();j++)
            {
                if(strnew[i]==strnew[j])
                {
                    freq[i]++;
                    strnew[j]='0';
                }
            }
        }
        for(int i=0;i<freq.length;i++)
        { 
            if(strnew[i]!=' ' && strnew[i]!='0')
                System.out.println(strnew[i] + " - " + freq[i]);
        }
 }
}