package Lop;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
public class AraylistInt {
	public static ArrayList<Integer> list =new ArrayList();
	
	
	public static void input() {
		
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.print("Input list: ");
			int n=sc.nextInt();
			list.add(n);
		}

	}

}
