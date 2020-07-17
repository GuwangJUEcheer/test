package Threadpratice;

public class MyThread2 {
public static void main(String[] args) {
	RunnableImpl r= new RunnableImpl();
	Thread t =new Thread(r);
	t.start();
	
	for(int i=0;i<20;i++) {
		System.out.println(Thread.currentThread().getName()+i);
	}
	
	//匿名内部类最终产物：实现类的对象
	new Thread() {
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
	}.start();
	
	new Thread(new Runnable(){
		@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
	}).start();
}
}
