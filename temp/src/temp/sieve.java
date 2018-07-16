package temp;

public class sieve {

	public static void main(String[] args) 
	{ int n=100,i,j;
	
	boolean prime[]=new boolean[n+1];
	for(i=0; i<n+1; i++)
		prime[i]=true;
		// TODO Auto-generated method stub
	for(i=2; i*i<=n; i++)
	{ if(prime[i]==true)
		for(j=2*i; j<=n; j=j+i)
			prime[j]=false;
	}

	
	for(i=2; i<n; i++)
	{ if(prime[i]==true)
		System.out.print(" "+i);
	}}

}
