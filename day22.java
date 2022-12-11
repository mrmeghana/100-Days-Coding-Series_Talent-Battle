import java.io.*;
import java.lang.*;
import java.util.*;
public class d2ay22
{
	public static int checkPrime(int n)
	{
		int i,isprime=1;
		if(n==0 || n==1)
		{
			isprime=0;
		}
		else
		{
			for(i=2;i<=n/2;++i)
			{
				if(n%i==0)
				{
					isprime=0;
					break;
				}
			}
		}
		return isprime;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,flag=0;
		n=sc.nextInt();
		for(i=2;i<=n/2;++i)
		{
			if(checkPrime(i)==1)
			{
				if(checkPrime(n-i)==1)
				{
					System.out.println(i+" "+(n-i));
					flag=1;
				}
			}
		}
		if(flag==0)
		{
			System.out.println(n);
		}

	}
}