package doAn;
import java.util.ArrayList;

public class MainDiemThi {

	public static void main(String[] args) {
		ArrayList<Student> studentlist=new ArrayList<Student>();
		Student st=new Student("Toan",4);
		studentlist.add(st);
		Student std=new Student("Trình",7);
		studentlist.add(std);
		StudentDao ob=new StudentDao();
		ob.ghiDiemThi(studentlist);
		
		ManagerStudent obj=new ManagerStudent();
		obj.docfile();
		obj.hienthi();
		obj.hienthiif();
		obj.lonNhat();
	}

}
