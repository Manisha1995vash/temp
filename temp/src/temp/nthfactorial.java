package temp;
class A
{  void num()
	{System.out.println("A");}
}

public class nthfactorial extends A {
	 void num()
	{System.out.println("B");}
	public static void main(String[] args)
	{ int n=4;
	int j=(int)(Math.round((Math.sqrt(2*3.14*n)*Math.pow(n, n)*Math.pow(2.718,-n))/10)*10);
	A a=new nthfactorial();
	a.num();
	System.out.println(j);
		// TODO Auto-generated method stub

	}

}
