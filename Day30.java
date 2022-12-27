import java.io.*;
import java.util.*;
import java.lang.*;
public class Day30
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int length=0;
        for(char c:str.toCharArray())
        {
            length++;
        }
        System.out.println(length);
    }
}