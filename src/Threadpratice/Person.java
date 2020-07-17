package Threadpratice;
/*主线程：执行主方法的线程

单线程程序*/
public class Person {
/*cpu:中央处理器,指挥电脑的硬件和软件工作。
 * 分为两种：1.CMD 2.inter
 * 例子：Inter core(核心) i7 8866 四核心8线程
 * 同时执行八个任务，点击软件进入内存就是进程。
 * cpu执行进程开辟的路径就是线程，进程的执行单元
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
