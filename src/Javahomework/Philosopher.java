package Javahomework;

public class Philosopher implements Runnable {

	private String name;
	private ChopStick left;
	private ChopStick right;
	private Integer thinkFactor;
	public Philosopher(String name, ChopStick left, ChopStick right, int thinkFactor) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.left=left;
		this.right=right;
		this.thinkFactor=thinkFactor;
	}
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
     while(!Thread.interrupted()) {
    	 try {
			left.take();
			right.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 System.out.println(this.name+"is eating");
    	
    	 try {
    			Thread.sleep(100);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	 System.out.println(this.name+"is thinking"+this.thinkFactor);
    	 
    	 left.drop();
		right.drop();
    	 
}

}
}