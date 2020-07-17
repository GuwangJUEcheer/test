package Demo01.Tread;

public class Demo01Thread {
public static void main(String[] args) {
	//創建Thread類的子类对象
	MyThread mt=new MyThread();
	mt.start();
	for(int i=0;i<20;i++) {
		System.out.println("main"+i);
	}//随机执行结果
}
}
