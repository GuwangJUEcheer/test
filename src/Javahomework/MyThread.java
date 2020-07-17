package Javahomework;

public class MyThread extends Thread{
 private ShareObj o ;
 public MyThread(ShareObj o){
	 this.o=o;
 }
 public void run() {
	 int n=0;
	 while(n<10) {
		 n++;
		 o.int_ij();
	 }
 }
}
