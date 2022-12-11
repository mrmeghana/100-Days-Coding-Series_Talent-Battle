import java.io.*;
import java.lang.*;
import java.util.*;
public class day18
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the value of x1 and y1: ");
 int x1=sc.nextInt();
 int y1=sc.nextInt();
 System.out.print("Enter the value of x2 and y2: ");
 int x2=sc.nextInt();
 int y2=sc.nextInt();
 int div;
 int x3=(x1*y2)+(x2*y1);
 int y3=y1*y2;
 if(x3>y3)
 div=y3;
 else
 div=x3;
 for(int i=div;i>0;i--)
 {
 if(x3%i==0 && y3%i==0)
 {
 x3=x3/i;
 y3=y3/i;
 }
 System.out.print("Sum of fractions is "+x3+"/"+y3);
 break;
 }
 
 }
}