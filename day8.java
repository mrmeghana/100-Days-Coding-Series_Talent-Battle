import java.io.*;
import java.lang.*;
import java.util.*;
public class day8
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    double d=b*b-4.0*a*c;  
    if(d>0)
    {
        double r1=-b+Math.pow(d,0.5)/2*a;
        double r2=b-Math.pow(d,0.5)/2*a;
        System.out.println(r1+" "+r2);
    }
    else if(d==0)
    {
        double r1=-b/2*a;
        System.out.println("The Roots are equal");
        System.out.println("Root1=root2= "+r1);
    }
    else
    {
        System.out.println("The roots are imaginary");
    }
}
}