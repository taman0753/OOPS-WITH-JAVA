
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Customer 
{
	private long id;
    	private String name;
	public Customer(long id, String name) 
	{
        	this.id = id;
        	this.name = name;
    	}

    	public long getId() 
	{
        	return id;
    	}

    	public void setId(long id) 
	{
        	this.id = id;
    	}

    	public String getName() 
	{
        	return name;
    	}

    	public void setName(String name) 
	{
        	this.name = name;
    	}

    	// Two customers are equal if their IDs are equal
    		public boolean equals(Object obj) 
		{
        		if (this == obj) 
			return true;
        		if (obj == null || getClass() != obj.getClass()) 
			return false;
        		Customer customer = (Customer) obj;
        		return id == customer.id;
    		}

    	@Override
   	public int hashCode() 
	{
        	return Objects.hash(id);
    	}

    	@Override
    	public String toString() 	
	{
        	return "Customer{" + "id=" + id + ", name='" + name + '\'' + '}';
    	}
}

public class Collection_exp3_3
{
    	public static void main(String[] args) 
	{
        	Set<Customer> customers = new HashSet<>();
        	customers.add(new Customer(1, "Atishay"));
        	customers.add(new Customer(2, "ABC"));
        	customers.add(new Customer(3, "XYZ"));
		for(Customer id:customers)
		{
			System.out.println(id);
		}	
		Customer c = new Customer(1, "Atishay");
		System.out.println(" Does this set contains key? " + customers.contains(c));
		
    	}
}