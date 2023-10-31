package Lop;

public class Napchong {

	static int add(int a, int b) {
		return(a+b);
	}
	static int add(int a, int b, int c) {
		return(a+b+c);
	}
	static double add(double a, double b) {
		return(a+b);
	}
	
	public static void main(String[] args) {
			Napchong lan1= new Napchong();
			Napchong lan2= new Napchong();
			Napchong lan3= new Napchong();
			System.out.println(lan1.add(6, 7));
			System.out.println(lan2.add(6, 7, 8));
			System.out.println(lan3.add(6, 7, 9 ));
	}

}
