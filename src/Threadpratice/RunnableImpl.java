package Threadpratice;

public class RunnableImpl implements Runnable{

	 private int ticket =100;
	 
	//设置线程任务
		Object obj=new Object();
	@Override
	public void run() {
		while(true) {//同步代码块
			synchronized(obj) {
		if(ticket>0) {
			//多线程访问共享数据会发生异常
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
			ticket--;
		}
		
	}
	}
}
}
