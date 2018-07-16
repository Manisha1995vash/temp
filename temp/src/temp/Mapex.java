package temp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Mapex 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> mymap =new ConcurrentHashMap<String,String>();
		mymap.put("1","1");
		mymap.put("2","1");
		mymap.put("3", "3");
		mymap.put("4","5");
		Iterator<String> i=mymap.keySet().iterator();
		while(i.hasNext())
		{String key=i.next();
		if(key.equals("3"))
			mymap.put(key+"new", "new3");
		}
		System.out.print(mymap);
		System.out.println();
		
		Map<String,String> mymap1 =new HashMap<String,String>();
		mymap1.put("1","1");
		mymap1.put("2","1");
		mymap1.put("3", "3");
		mymap1.put("4", "1");
		Iterator<String> i1=mymap1.keySet().iterator();
		while(i1.hasNext())
		{String key=i1.next();
		if(key.equals("3"))
			mymap1.put(key+"new", "new3");
		}
		System.out.print(mymap1);


	}

}
