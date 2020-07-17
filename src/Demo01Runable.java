
public class Demo01Runable {
public static void main(String[] args) {
	RunableImpl run=new RunableImpl();
	Thread t =new Thread(run);
	t.start();
	for(int i=0;i<20;i++) {
		System.out.println(Thread.currentThread().getName()+"...>"+i);
	}//随机执行结果
	/*实现runable接口的好处
	1.一个类只能继承一个类，实现接口还可以继承其他的类
	2.增强了程序的拓展性
	3.实现类中，重写了run方法，用来设置线程任务*/
}
}
