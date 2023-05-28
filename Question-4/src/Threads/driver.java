package Threads;

public class driver {

	public static void main(String[] args) throws Exception{
		process1 pro1=new process1();
		process2 pro2=new process2();
		pro1.start();
		Thread.sleep(5000);
		pro2.start();
	}

}