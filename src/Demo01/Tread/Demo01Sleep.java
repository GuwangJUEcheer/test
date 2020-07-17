package Demo01.Tread;

public class Demo01Sleep {
public static void main(String[] args) throws InterruptedException {
	for(int i=1;i<=60;i++){
	System.out.println(i);
	Thread.sleep(1000);
	}
}
}
