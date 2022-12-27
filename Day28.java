import java.io.*;
import java.lang.*;
import java.util.*;
public class Day28
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        System.out.println(str2);
    }
}