package Threadpratice;
/*���̣߳�ִ�����������߳�

���̳߳���*/
public class Person {
/*cpu:���봦����,ָ�ӵ��Ե�Ӳ�������������
 * ��Ϊ���֣�1.CMD 2.inter
 * ���ӣ�Inter core(����) i7 8866 �ĺ���8�߳�
 * ͬʱִ�а˸����񣬵����������ڴ���ǽ��̡�
 * cpuִ�н��̿��ٵ�·�������̣߳����̵�ִ�е�Ԫ
 */
	private String name;
	
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(name+"-->"+i);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
}
