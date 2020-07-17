package Javahomework;

public class Test {
public static void main(String[] args) {
	//ShareObj o=new ShareObj();
	ShareObj o=new Sync_shareObj();//多态
	MyThread mt=new MyThread(o);
	mt.start();
	MyThread mt2=new MyThread(o);
	mt2.start();
	
	/*1.ShareObj类重写了String类的toString方法，使用format方法将
	 * 字符串的格式设置为指定的字符串的新格式。MyThread类继承了Thread类，是其一个子类
	 * 设置多线程任务时可以通过创建Thread类的子类，并重写其run方法，使用时创建子类的实例化对象
	 * 用对象调用线程的start方法即可。
	 * 在Test里线程的子类对象是通过调用MyThread含参构造产生的
	 * 此构造方法将ShareObj对象作为参数传递。重写后的run方法是运行ShareObj中的方法10次。
	 * 传递ShareObj对象，使用其调用ShareObj类的方法int_ij。
	 * 其内部的sleep函数使当前线程暂停运行。毫秒结束后继续运行
	 */
	
	/*2.使用同步方法确保多线程的安全问题，锁对象就是调用方法的对象，this,线程的实例化对象。
	 * runnable的话this就是其实现类对象。抢夺cpu的执行权，到同步代码区域。若无锁对象
	 * 则等待，否则执行。无锁对象的线程等待其它线程执行完后归还锁对象。
	 */
	
	
}
}
