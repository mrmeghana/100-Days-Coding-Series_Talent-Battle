import java.io.*;
import java.lang.*;
import java.util.*;
public class Day35
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=new char[str.length()];
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                sum=sum+Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);

    }
}