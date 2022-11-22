import java.io.*;
import java.lang.*;
import java.util.*;
public class day6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>0 && y>0)
        {
            System.out.println("This point lies in first quadrant.");
        }
        else if(x<0 && y>0)
        {
            System.out.println("This point lies in second quadrant.");
        }
        else if(x<0 && y<0)
        {
            System.out.println("This point lies in third quadrant.");
        }
        else
        {
            System.out.println("This point lies in fourth quadrant.");
        }

    }
}