import java.util.HashSet;
 
public class Collection_exp3 
{
 	public static void main(String args[])
	{
        	HashSet<String> hs = new HashSet<String>();
        	hs.add("Object");
        	hs.add("Oriented");
        	hs.add("Programming");
        	System.out.println(hs);
        	HashSet<String> subSet = new HashSet<String>();
        	subSet.add("OOPS :");
        	hs.addAll(subSet);
        	System.out.println("HashSet content after copying  ");
        	System.out.println(hs);
        	System.out.println("Clearing HashSet !!!");
       		hs.clear();
        	System.out.println("Content After clear - ");
        	System.out.println(hs);
    	
	}
}
