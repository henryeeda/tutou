package test;

public class test implements Runnable{
	test(){
		System.out.println("这是个test类");
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("这是个test类的定时方法1");
		System.out.println("这是个test类的定时方法2");
		System.out.println("这是个test类的定时方法3");
	}
}
