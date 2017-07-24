package guvi;

import java.util.*;

public class secsmall {
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the array count");
		int n=S.nextInt();
		System.out.println("Enter the array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();	
		}
		Arrays.sort(a);
		System.out.println("Second smallest element entered is "+a[1]);
	}
}

