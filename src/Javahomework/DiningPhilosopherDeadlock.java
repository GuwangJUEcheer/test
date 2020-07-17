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
       
     //����һ���̳߳�(executors�̹߳�����)
       
       ChopStick[] sticks =new ChopStick[size];
       String[] philosophers= {"A","B","C","D"};
    	
       for(int i=0;i<size;i++) 
    	   sticks[i]=new ChopStick(i+1);
    	   for(int i=0;i<size;i++) 
    		   exec.execute(new Philosopher(philosophers [i],sticks[i],sticks[(i+1)%size],think)); 
    	   TimeUnit.SECONDS.sleep(5);//�˵ȼ���Thread.sleep(5);
    	   /*
    	   sleep����ִ������ȿ�����ͬ�������Ҳ���Բ���
    	   ��wait�����������У�ʹ����ͬ��������У�wait�������ͷ�����sleep���������ͷ������� ������û���ͷ�������
    	   �ȴ��е������̻߳�һֱ�������ߵȴ�״̬
    	   */
    	   exec.shutdownNow();
    	   //��ͼֹͣ��������ִ�еĻ����ͣ�������ڵȴ������񡣲����صȴ�ִ�е������б�.
       }catch(Exception e) {
       e.printStackTrace();
	}

}
}