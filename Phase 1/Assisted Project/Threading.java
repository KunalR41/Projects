package Ass3;

public class Threading  extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		Threading mt = new  Threading();
	  		mt.start();
	 	}
	}

