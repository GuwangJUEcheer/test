package Threadpratice;

public class Demo01MainThread extends Thread {

	
	/*Person p1=new Person("a");
	p1.run();
	
	System.out.println(0/0);
	//����Ĳ���ִ��
	Person p2=new Person("b");
	p2.run();
	
	   �������̳߳���ĵ�һ�ַ�ʽ���̳�Thread��
	 * 1����������
	 * 2����������дThread��run�����������߳�����
	 * 3����Thread����������
	 * 4����start���������µ��̣߳���ִ���̵߳�����
	 * java����������ռʽ���ȣ��ĸ����ȶȸ�ִ���ĸ�
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
