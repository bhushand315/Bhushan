package firstdemo;

public class CreatThread implements Runnable {
     private Thread t;
	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			long start= System.currentTimeMillis();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long end=System.currentTimeMillis();
			System.out.println("time difference between thread sleep"+(end-start));
		}
		
	}

}
