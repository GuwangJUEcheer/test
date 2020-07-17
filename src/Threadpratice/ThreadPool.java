package Threadpratice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
public static void main(String[] args) {
	ExecutorService service =Executors.newFixedThreadPool(3);
	service.submit();//适合callable街口
	service.execute();//适合runnable接口
}
}
