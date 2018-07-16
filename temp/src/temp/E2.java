package temp;
import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int h1=s.nextInt();
		int a1=s.nextInt();
		int c1=s.nextInt();
		int h2=s.nextInt();
		int a2=s.nextInt();
		int av,am,i=0,j;
		
		if(h2%a1==0)
			av=h2/a1;
		else
			av=(h2/a1)+1;
		if(h1%a2==0)
			am=h1/a2;
		else
			am=(h1/a2)+1;
		if(av-am>0)
		for(i=1;i<av;i++)
		{ if((i*c1)%a2==0)
			{if(((i*c1)/a2)>av-am)
			break;}
			else
				{if((((i*c1)/a2)+1)>av-am)
					break;}
				
		}
		//String ans[]=new String[av+i];
		System.out.println(av+i);
		for(j=0; j<av+i; j++)
			if(j<i)
				System.out.println("HEAL");
			else
				System.out.println("STRIKE");
		

	}

}
