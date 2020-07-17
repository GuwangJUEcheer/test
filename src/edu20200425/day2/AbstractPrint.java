package edu20200425.day2;

public abstract class AbstractPrint {
	abstract void open();
	abstract void close();
	abstract void print(String txt);
	public void open(String txt){ 
		open();
		print(txt);
		close();
		
	}

}
