import java.io.*;
import java.lang.*;
import java.util.*;
public class day2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Not an Alphabet");
        }
    }
}
