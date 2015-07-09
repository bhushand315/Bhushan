package firstdemo;

public class Test {
	public static void main(String[] args) {
		CreatThread ct=new CreatThread();
		Thread t1=new Thread(ct);
		t1.start();
	}

}
