
public class Demo01InnerClassThread {
public static void main(String[] args) {
	new Thread() {
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println(Thread.currentThread().getName()+"...>"+"ºÚÂí");
		}
	}
}.start();
 new Thread(new Runnable() {
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"...>"+"³ÌĞòÔ±");
	}
}
}).start();
}
}
