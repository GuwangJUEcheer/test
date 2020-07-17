package Javahomework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DiningPhilosopherDeadlock {

	public static void main(String[] args) {
		try {
       int think =0;
       int size=4;
       ExecutorService exec =Executors.newCachedThreadPool();
       
     //创建一个线程池(executors线程工厂类)
       
       ChopStick[] sticks =new ChopStick[size];
       String[] philosophers= {"A","B","C","D"};
    	
       for(int i=0;i<size;i++) 
    	   sticks[i]=new ChopStick(i+1);
    	   for(int i=0;i<size;i++) 
    		   exec.execute(new Philosopher(philosophers [i],sticks[i],sticks[(i+1)%size],think)); 
    	   TimeUnit.SECONDS.sleep(5);//此等价于Thread.sleep(5);
    	   /*
    	   sleep方法执行区域既可以是同步代码块也可以不是
    	   与wait方法的区别还有：使用在同步代码块中，wait方法会释放锁。sleep方法不会释放锁对象 。由于没有释放锁对象
    	   等待中的其它线程会一直处于无线等待状态
    	   */
    	   exec.shutdownNow();
    	   //试图停止所有正在执行的活动，暂停处理正在等待的任务。并返回等待执行的任务列表.
       }catch(Exception e) {
       e.printStackTrace();
	}

}
}