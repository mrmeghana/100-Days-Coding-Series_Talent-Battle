import java.io.*;
import java.util.*;
import java.lang.*;
public class Day33
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String str2="";
            int a=str.length();
            for(int i=a-1;i>=0;i--)
            {
                str2=str2+str.charAt(i);
            }
            if(str.equals(str2))
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not a  Palindrome");
            }
    }
}
