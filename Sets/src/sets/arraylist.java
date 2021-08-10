package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
ArrayList a = new ArrayList();


a.add(12);
a.add(13);
a.add(14);
System.out.println(a.size());
System.out.println(a.get(0));
System.out.println(a.get(1));
System.out.println(a.get(2));

try
{
System.out.println(a.get(3));

	}
catch(IndexOutOfBoundsException w)
{
System.out.println("no such index present");
}
	


HashSet<Integer> t = new HashSet<Integer>();
{
	t.add(34);
	t.add(34);
	t.add(32);
	t.add(32);
	Iterator i = t.iterator();
	for(int d : t)
	{System.out.println(i.next());
		
	}
	i = t.iterator();
	System.out.println(i.next());
}


}
}

//






