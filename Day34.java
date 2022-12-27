import java.io.*;
import java.lang.*;
import java.util.*;
public class Day34
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String newstr=str.replaceAll("[{}()]","");
        System.out.println(newstr);

        
    }
}