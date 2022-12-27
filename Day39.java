import java.io.*;
import java.lang.*;
import java.util.*;
public class Day39
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length())
        {
            char ch1[]=str1.toCharArray();
            char ch2[]=str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result=Arrays.equals(ch1,ch2);
            if(result)
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not a Anagram");
            }
        }
        else{
            System.out.println("Not a Anagram");
        }

    }
}