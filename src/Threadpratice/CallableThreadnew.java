package Threadpratice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadnew {
public static void main(String[] args) throws ExecutionException {
	CallableThread a=new CallableThread();
	FutureTask<?> futureTask=new FutureTask<Object>(a);
	new Thread(futureTask).start();
	try {
		Object sum =futureTask.get();
		System.out.println(sum);
	} catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
