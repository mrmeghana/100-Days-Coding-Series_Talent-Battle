import java.io.*;
import java.util.*;
import java.lang.*;
class Isosceles
{
    void display1()
    {
        System.out.println("I am an Isosceles Triangle");
    }
}
class Equilateral extends Isosceles
{
    void display2()
    {
        System.out.println("I am an Equilateral Triangle");
    }
}
class C extends Equilateral
{
    void display3()
    {
        System.out.println("I am triangle");
    }
}

public class Day69
{
    public static void main(String[] args)
    {
        C object=new C();
        object.display2();
        object.display1();
        object.display3();
    }
}