package Javahomework;

public class ChopStick {
 private Integer id;
 private boolean  taken=false;
public ChopStick(Integer id) {
	super();
	this.id = id;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public  boolean isTaken() {
	return taken;
}

public synchronized void take() throws InterruptedException {
	while(taken) {
		wait();
	}
	taken=true;
}
public synchronized void drop() {
	taken=false;
	notifyAll();  
}
}
