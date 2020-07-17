
package Threadpratice;
public class Demo01Thread{
	public static void main(String[] args) {
	Demo01MainThread m =new Demo01MainThread();
	m.start();
	new Demo01MainThread().start();
	new Demo01MainThread().start();
}
}