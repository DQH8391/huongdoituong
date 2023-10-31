package Lop;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
public class ArrayListInt {

		public static ArrayList<Integer> list =new ArrayList();
										//list là tên biến có thể thay đổi.
		
		public static void input() {
			
			Scanner sc= new Scanner(System.in);
			for(int i=0; i<5; i++) {
				System.out.print("Input list: ");
				int n=sc.nextInt();
				list.add(n);
			}

		}
		public static void display() {
			for (int i=0; i<list.size();i++) 
			{
				System.out.println(list.get(i));
			}
		}
		//tìm kiếm thấy thì xóa
		public static void delete(int number) {
			for (int i=0; i<list.size();i++) {
				if(list.get(i).equals(number))
					list.remove(i);
			}
		}
		//xắp xếp
		public static void sort() {
			//tăng dần
			list.sort(Comparator.naturalOrder());
			//giảm dần
			list.sort(Comparator.reverseOrder());
		}
		public static int Max() {
			int max = list.get(0);
			for(int i=0; i<list.size(); i++) {
				if(max<list.get(i)) max=list.get(i);
			}
			return max;
		}
		public static void LonHon() {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i)>=5) System.out.println(list.get(i));
				
			}
		}
	}
