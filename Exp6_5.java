import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection_exp
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Object");
        	list.add("Oriented");
        	list.add("Programming");
        	Iterator<String> itr = list.iterator();
        	while(itr.hasNext())
		{
            		System.out.println(itr.next());		//prints the array list
        	}
		Collections.reverse(list);
        	System.out.println("After Reverse : ");
        	for(String str: list)
		{
            		System.out.println(str);		//prints the reversed array list
        	}
		System.out.println("Actual ArrayList:"+list);
        	ArrayList<String> copy = (ArrayList<String>) list.clone();
        	System.out.println("Duplicate ArrayList:"+copy);		//copies the array list
    	}
}
