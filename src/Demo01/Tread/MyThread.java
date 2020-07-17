package Demo01.Tread;
/*创建多线程程序第一种方式：创建Tread类子类
 * 1创建Thead的子类
 * 2.重写run
 * 3，实现子类
 * 4调用start（）
 *void start()使得线程开始执行，java虚拟机调用run。两个线程并发运行，当前线程（main）与另外线程（创建的线程）
 *多次启动一个线程会报错，java抢占式调用，按优先级执行程序
 */
public class MyThread extends Thread {
	public void run() {
		//for(int i=0;i<20;i++) {
			//System.out.println("run"+i);
		/*Thread t=Thread.currentThread();
		System.out.println(t);
		String name=t.getName();
		System.out.println(name);*/
		System.out.println(Thread.currentThread().getName());
		}
	}


