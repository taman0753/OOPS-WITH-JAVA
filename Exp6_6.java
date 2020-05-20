import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_exp2 
{	
	public static void main(String args[])
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "Object");
        	hm.put("2", "Oriented");
        	hm.put("3","Programming");
        	System.out.println(hm);
        	
		//finds whether specified key exists or not
		if(hm.containsKey("1"))
		{
            		System.out.println("The hashmap contains key 1");
        	} 
		else 
		{
            		System.out.println("The hashmap does not contains key 1");
        	}
        	if(hm.containsKey("4"))
		{
            		System.out.println("The hashmap contains key 4");
        	} 
		else 
		{
            		System.out.println("The hashmap does not contains key 4");
        	}
		
		//finds whether specified value exists or not
		if(hm.containsValue("Object"))
		{
            		System.out.println("The hashmap contains value Object");
        	} 
		else 
		{
            		System.out.println("The hashmap does not contains value Object");
        	}
        	if(hm.containsValue("JAVA"))
		{
            		System.out.println("The hashmap contains value JAVA");
        	} 
		else 
		{
           		System.out.println("The hashmap does not contains value JAVA");
        	}

		//gets all keys from the HashMap
		Set<String> keys = hm.keySet();
        	for(String key: keys)
		{
            		System.out.println(key);
        	}

		//gets all key-value from the HashMap
		Set<Entry<String, String>> entires = hm.entrySet();
        	for(Entry<String,String> ent:entires)
		{
            		System.out.println(ent.getKey()+" ==> "+ent.getValue());
        	}
	}
}
