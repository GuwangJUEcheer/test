package Javahomework;

public class Test {
public static void main(String[] args) {
	//ShareObj o=new ShareObj();
	ShareObj o=new Sync_shareObj();//��̬
	MyThread mt=new MyThread(o);
	mt.start();
	MyThread mt2=new MyThread(o);
	mt2.start();
	
	/*1.ShareObj����д��String���toString������ʹ��format������
	 * �ַ����ĸ�ʽ����Ϊָ�����ַ������¸�ʽ��MyThread��̳���Thread�࣬����һ������
	 * ���ö��߳�����ʱ����ͨ������Thread������࣬����д��run������ʹ��ʱ���������ʵ��������
	 * �ö�������̵߳�start�������ɡ�
	 * ��Test���̵߳����������ͨ������MyThread���ι��������
	 * �˹��췽����ShareObj������Ϊ�������ݡ���д���run����������ShareObj�еķ���10�Ρ�
	 * ����ShareObj����ʹ�������ShareObj��ķ���int_ij��
	 * ���ڲ���sleep����ʹ��ǰ�߳���ͣ���С�����������������
	 */
	
	/*2.ʹ��ͬ������ȷ�����̵߳İ�ȫ���⣬��������ǵ��÷����Ķ���this,�̵߳�ʵ��������
	 * runnable�Ļ�this������ʵ�����������cpu��ִ��Ȩ����ͬ��������������������
	 * ��ȴ�������ִ�С�����������̵߳ȴ������߳�ִ�����黹������
	 */
	
	
}
}
