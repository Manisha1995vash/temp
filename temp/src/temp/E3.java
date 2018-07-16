package temp;

import java.util.Scanner;

import java.util.*;

public class E3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c=1,t=0,i,k=0,temp=0;
		for(i=0;i<n; i++)
			a[i]=s.nextInt();
		Arrays.sort(a);
		
		//int i,j,k;
		//b[0]=a[0];
		for(i=1; i<n; i++)
			{ if(((a[i]==a[i-1])&&t==0) &&k==0)
				{c=c+1;t=1;k=k+1;}
			else if(a[i]==a[i-1]&& k!=0)
			{k=k+1;}
			else
				{t=0; 
				if(k>temp)
					temp=k;
				k=0;}
			}
		System.out.println(temp);
	}

}
