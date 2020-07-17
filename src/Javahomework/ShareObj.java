package Javahomework;

public class ShareObj {
   int i=0;
   int j=0;
public void int_ij() {
	i=i+1;
	int newj=j+1;
	try {
		Thread.sleep(500);
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	j=newj;
	System.out.println(String.format("1=%s,j=%s",i,j));
}
public String toString() {
	return "shareObj [i=" +i+ ",j=" +j + "]";
}

}
