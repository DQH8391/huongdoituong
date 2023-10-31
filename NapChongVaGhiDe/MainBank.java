package NapChongVaGhiDe;

public class MainBank {

	public static void main(String[] args) {
		SBI s =new SBI();
		System.out.println("SBI .." +s.getRate());
		
		ICICI i=new ICICI();
		System.out.println("CICI.. " +i.getRate());
		
		AXIS a=new AXIS();
		System.out.println("AXIS.. " +a.getRate());

	}

}
