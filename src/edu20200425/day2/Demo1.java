package edu20200425.day2;

	public class Demo1{
		
		public static void main(String[] args) {
			print99(3);		
		}
		private static void print99(int n){ 
			for(int i=1; i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(i+"*"+j+"="+(i*j));
				}
				System.out.println();
			}
		}
	}
	


	
