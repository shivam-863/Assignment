package Assign;


class PrintNumber implements Runnable
{
	@Override
	public void run(){
		for(int Number=1;Number<
				27;Number++)
		{ 
			Thread t = new Thread();
			
			try
			{System.out.println(Number);
			t.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println("Process intrrupted Number");// TODO: handle exception
			}
			
			
		}
		
		// TODO Auto-generated method stub
		
	}
}

class PrintChar implements Runnable
{
	@Override
	public void run() {
		for(char alpha='A';alpha<='Z';alpha++)
		{
Thread t = new Thread();
			
			try
			{System.out.println(alpha);
			t.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println("Process intrrupted alpha");// TODO: handle exception
			}
		// TODO Auto-generated method stub
		
	}
}
}





public class PrintNumberCharThreadInterface {

	public static void main(String[] args) throws InterruptedException{
	Runnable Number=new PrintNumber();
	Runnable alpha=new PrintChar();
	Thread t1 = new Thread(Number);
	Thread t2 = new Thread(alpha);
	t1.start();
	
	t2.start();
	t2.sleep(1000);
		
		// TODO Auto-generated method stub

	}

}

