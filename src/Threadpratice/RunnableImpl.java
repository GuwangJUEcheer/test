package Threadpratice;

public class RunnableImpl implements Runnable{

	 private int ticket =100;
	 
	//�����߳�����
		Object obj=new Object();
	@Override
	public void run() {
		while(true) {//ͬ�������
			synchronized(obj) {
		if(ticket>0) {
			//���̷߳��ʹ������ݻᷢ���쳣
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"��������"+ticket+"��Ʊ");
			ticket--;
		}
		
	}
	}
}
}
