package temp;
import java.util.Scanner;


public class NUMBERGUESSING {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int turn=0;
		int n,a,b,m;
		String st;
		st=s.nextLine();
		do
		{ a=s.nextInt();
		  b=s.nextInt();
		  n=s.nextInt();
		 st=s.nextLine();st=s.nextLine();
		 a=a+1;turn=turn+1;
	        do
	        { m=(a+b)/2;
	        System.out.println(m);
	        	st=s.nextLine();
	        	if(st.equals("TOO_SMALL"))
	        		a=m+1;
	        	else if(st.equals("TOO_BIG"))
	        		a=m+1;
	        	else if(st.equals("WRONG_ANSWER"))
	        		System.exit(0);
	        		
	        }while(!st.equals("CORRECT"));
			
		}while(turn!=t);
		

	}

}
