package Lop;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListStudent {

	public static ArrayList<Student> StudentList= new ArrayList<Student>();
	
	public static void nhap() {
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++) {
			System.out.println("Nhap id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Nhap họ tên: ");
			String name=sc.nextLine();
			System.out.println("Nhap GPA: ");
			float gpa =sc.nextFloat();
			Student toan=new Student(id,name,gpa);
			StudentList.add(toan);
		}
	
	}
	public static void hienthi() {
		for(int i=0; i<StudentList.size();i++) {
			System.out.println(StudentList.get(i).getId()+ " | " +StudentList.get(i).getName()+ " | "  +StudentList.get(i).getGpa()+ " | "  +StudentList.get(i).getKq());
		}
	}
	public static void hienthi2() {
		for (Student st: StudentList) {
		if(st.getGpa()>=5)	System.out.println(st.getId()+" | "+st.getName()+" | "+st.getGpa()+" | "+st.getLn());
		}
	}
	public static float ln() {
		float max = StudentList.get(0).getGpa();
		for(Student st: StudentList) {
			if(max<st.getGpa()) max=st.getGpa();
		}
		return max;
	}
	
	public static void KetQua() {
		for (int i=0; i<StudentList.size();i++) {
			if(StudentList.get(i).getGpa()>=5) StudentList.get(i).setKq("Đậu");
			else StudentList.get(i).setKq("Rớt");
		}
	}
	public static void sort() {
		Collections.sort(StudentList, new Comparator<Student>()
				{
			public int compare(Student sv1, Student sv2) {
				if(sv1.getGpa()< sv2.getGpa()) return -1;
					else if (sv1.getGpa()== sv2.getGpa()) return 0;
					   else return 1;
			}
				});
		
		
	}
	public static void xepLoai() {
		for(int i=0; i< StudentList.size();i++) {
			if(StudentList.get(i).getGpa()<4) StudentList.get(i).setXl("Kém");
			else if(StudentList.get(i).getGpa()<5) StudentList.get(i).setXl("Trung bình");
			else if(StudentList.get(i).getGpa()<8) StudentList.get(i).setXl("Khá");
			else if(StudentList.get(i).getGpa()<9) StudentList.get(i).setXl("Giỏi");
		}
	}
	
	public static void chen(int vt, Student toan) {
		StudentList.add(vt,toan);
		
	}
	public static void xoa(String name) {
		for(int i=0; i<StudentList.size(); i++)
			if(StudentList.get(i).getName().equals(name)==true) StudentList.remove(i);
	}
	public static void sua(int id, String name, float gpa) {
		for(int i=0; i<StudentList.size();i++)
		{
			if(StudentList.get(i).getId()==id);
			{
				StudentList.get(i).setName(name);;
				StudentList.get(i).setGpa(gpa);
				break;
			}
		}
	}
	














}