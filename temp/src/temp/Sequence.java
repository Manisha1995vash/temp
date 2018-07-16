package temp;
import java.util.Scanner;


public class Sequence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.print("enetre num");
	
		int n=s.nextInt();
		int q=s.nextInt();
		int i=0,k=1,sh=0,l;
		int ar[]=new int[2*n];
		int op[]=new int[q];
		l=2*n-1;
		for(i=0; i<q;i++)
			op[i]=s.nextInt();
	   for(i=0;i<((2*n)-1); i=i+2)
		{ ar[i]=0;
		 ar[i+1]=k;
		 ++k;//System.out.println("+");
		
		}k=0;
		/*
		for(i=0;i<2*n; i++)
		{ System.out.print(ar[i]);
		}*/
			
		do
		{ if(k==0)
		{sh=2;
		ar[l-3]=ar[l];
		l=l-2;++k;
		 
		}
		else if(k==1)
		{ sh=2;
		 ar[l-3]=ar[l];
		 l=l-1;++k;
		}
		else
		{ sh=sh+1;
		  ++k;
		  ar[l-(sh+1)]=ar[l];
		  l=l-1;
		  
		}
			
			
		}while(l!=n);
		/*System.out.println();
		for(i=0;i<2*n; i++)
		{ System.out.print(ar[i]);
		}*/
		for(i=0;i<q; i++)
		{ System.out.println(ar[op[i]]);
		}
		

	}

}
