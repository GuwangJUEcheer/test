package Demo01.Tread;
/*�������̳߳����һ�ַ�ʽ������Tread������
 * 1����Thead������
 * 2.��дrun
 * 3��ʵ������
 * 4����start����
 *void start()ʹ���߳̿�ʼִ�У�java���������run�������̲߳������У���ǰ�̣߳�main���������̣߳��������̣߳�
 *�������һ���̻߳ᱨ��java��ռʽ���ã������ȼ�ִ�г���
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


