package temp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List <emp> l=new ArrayList <emp>();
		l.add(new emp("ram",2));
		l.add(new emp("ram4",20000));

		l.add(new emp("ram2",200));
	    l.add(new emp("ram1",20));

		l.add(new emp("ram3",2000));
		for(emp e:l)
			System.out.println(e.getsalary());

		Collections.sort(l);
		for(emp e:l)
			System.out.println(e.getsalary());

	}

}
class emp implements Comparable <emp>
{ String name;
 int salary;
 emp(String name, int salary)
 { this.name=name;
    this.salary=salary;
    }
 int getsalary()
 {return salary;}
 public int compareTo(emp e)
 { System.out.print("sort");
 if(this.salary>e.salary)
	 return -1;
 else if(this.salary<e.salary)
	 return 1;
 else
	 return 0;
 }
 }
