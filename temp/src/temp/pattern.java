package temp;

public class pattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,k=1;
		for(i=1; i<=5;i++)
		{ for(j=1; j<=i;j++)
		{ if(i%2!=0)
			{System.out.print(k+" ");
		    ++k;}
		else 
		{ System.out.print(k+i-1+" ");
		  --k;
		}
		
		} if(i%2==0)
		{ k=k+2+i;}
		System.out.println(k);
		}

	}

}
