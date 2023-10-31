package main;
import Lop.Student;
public class MainStudent {
	
		public static void main(String[] args) {
			Student sd1 =new Student(1, "Toan",9);
			Student sd2 =new Student(2, "trinh",9);
			Student sd3 =new Student(3, "trinh",9);
			Student sd4 =new Student();
			sd1.display();
			sd2.display();
			sd3.display();
			sd4.display();
		}
}
