package Threadpratice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
public static void main(String[] args) {
	ExecutorService service =Executors.newFixedThreadPool(3);
	service.submit();//�ʺ�callable�ֿ�
	service.execute();//�ʺ�runnable�ӿ�
}
}
