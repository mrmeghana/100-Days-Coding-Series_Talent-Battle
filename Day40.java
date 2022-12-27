import java.io.*;
import java.lang.*;
import java.util.*;
public class Day40
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the SubString to be removed: ");
        String substr=sc.nextLine();
        System.out.println("Enter the String to eb replaced: ");
        String repl=sc.nextLine();
        String strrepl=str.replace(substr,repl);
        System.out.println(strrepl);
    }
}