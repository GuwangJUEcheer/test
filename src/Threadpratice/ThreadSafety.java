package Threadpratice;

public class ThreadSafety {
	public static void main(String[] args) {
		
		//同步锁机制，创建锁对象
		Object obj=new Object();
		
RunnableImpl run =new RunnableImpl();
Thread t0=new Thread(run);
Thread t1=new Thread(run);
Thread t2=new Thread(run);
Thread t3=new Thread(run);

t0.start();
t1.start();
t2.start();
t3.start();
}
}
