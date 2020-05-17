class even extends Thread
{
	Thread t=null;
	even()
	{
		t=new Thread(this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=2;i<10;i+=2)
			System.out.print(i+"\n");
			Thread.sleep(100);
		}
	
		catch(Exception e)
		{
			System.out.println("thread interepted");
		}
	}
}

class odd extends Thread
{
	Thread t=null;
	odd()
	{
		t=new Thread(this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<10;i+=2)
			System.out.print(i+"\n" );
			Thread.sleep(100);
		}

		catch(Exception e)
		{
			System.out.println("thread interepted");
		}
	}
}
public class Thread_exp2
{
	public static void main(String args[])
	{
		even e=new even();
		odd o=new odd();
	}	
}
