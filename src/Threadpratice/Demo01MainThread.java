package Threadpratice;

public class Demo01MainThread extends Thread {

	
	/*Person p1=new Person("a");
	p1.run();
	
	System.out.println(0/0);
	//后面的不再执行
	Person p2=new Person("b");
	p2.run();
	
	   创建多线程程序的第一种方式：继承Thread类
	 * 1创建其子类
	 * 2在子类中重写Thread的run方法并设置线程任务
	 * 3创建Thread类的子类对象
	 * 4调用start方法开启新的线程，并执行线程的任务。
	 * java程序属于抢占式调度，哪个优先度高执行哪个
	 */
	public void run() {
	/*String name =getName();
	System.out.println(name);
	*/
		Thread t =Thread.currentThread();
				System.out.println(t);
				System.out.println(Thread.currentThread().getName());
	}
}
