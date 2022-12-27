import java.io.*;
import java.lang.*;
import java.util.*;
public class Day36
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String firstletter=str.substring(0,1);
        String lastletter=str.substring(n-1);
        String rem=str.substring(1, n-1);
        System.out.println(firstletter.toUpperCase()+rem+lastletter.toUpperCase());
    }
}