
public class Demo01Runable {
public static void main(String[] args) {
	RunableImpl run=new RunableImpl();
	Thread t =new Thread(run);
	t.start();
	for(int i=0;i<20;i++) {
		System.out.println(Thread.currentThread().getName()+"...>"+i);
	}//���ִ�н��
	/*ʵ��runable�ӿڵĺô�
	1.һ����ֻ�ܼ̳�һ���࣬ʵ�ֽӿڻ����Լ̳���������
	2.��ǿ�˳������չ��
	3.ʵ�����У���д��run���������������߳�����*/
}
}
