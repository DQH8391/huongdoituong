package main;
import Lop.ArrayListInt;
public class MainArrayListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListInt.input();
		ArrayListInt.display();
		ArrayListInt.delete(5);
		System.out.println("Danh sách sau khi xóa là: ");
		ArrayListInt.display();
		ArrayListInt.sort();
		System.out.println("Danh sách sau khi sắp xếp là");
		ArrayListInt.display();
		ArrayListInt.Max();
		System.out.println("Biểu số lớn nhất: " +ArrayListInt.Max());
		System.out.println("Các số lớn hơn bằng 5 là: " );
		ArrayListInt.LonHon();
	}

}
