package Demo01.Tread;

public class Demo01Ticket {
public static void main(String[] args) {
	RunableImpl run= new RunableImpl();
	Thread t0=new Thread (run);
	Thread t1=new Thread (run);
	Thread t2=new Thread (run);
	t0.start();
	t1.start();
	t2.start();
}
}
