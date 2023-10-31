package main;
import Lop.Student;
import Lop.ArrayListStudent;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class MainArrayListStuden {
	public int n;
	public static void main(String[] args) {
		ArrayListStudent.nhap();
		System.out.println("Danh sách Student");
		ArrayListStudent.KetQua();
		ArrayListStudent.ln();
		ArrayListStudent.xepLoai();
		ArrayListStudent.hienthi();
		ArrayListStudent.ln();
		System.out.println("Student có GPA lớn nhất" +ArrayListStudent.ln());
		
		ArrayListStudent.sort();
		System.out.println("Sau khi xếp loại");
		ArrayListStudent.hienthi();
		
		System.out.println("Nhập thông tin cần sửa  đổi");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin ID");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập thông tin tên");
		String name=sc.nextLine();
		System.out.println("Nhập thông tin GPA");
		float gpa = sc.nextFloat();
		ArrayListStudent.sua(id, name, gpa);
		System.out.println("Danh sách sau khi sửa");
		ArrayListStudent.hienthi();
		
		
		
	
	}

}
