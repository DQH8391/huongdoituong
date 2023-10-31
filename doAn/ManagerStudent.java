package doAn;
import java.util.ArrayList;

public class ManagerStudent {
	public ArrayList<Student> StudentList =new ArrayList<Student>();
	public void docfile() {
		StudentDao obj=new StudentDao();
		
		StudentList= obj.docDiemThi("d:\\thi1.bin");
	}
	public void hienthi() {
		System.out.println("Danh sách sinh viên");
		for (Student st: StudentList)
		{
			System.out.println("Ho ten la: " +st.getHoTen()+"  "+ "Diem trung binh la: " +st.getDiemTrungBinh() );
		}
	}
	public void hienthiif() {
		System.out.println("Danh sách sinh viên có điểm trung bình lớn hơn 5");
		for (Student st: StudentList)
		{if (st.getDiemTrungBinh()>5) 
			System.out.println("Ho ten la: " +st.getHoTen()+"  "+ "Diem trung binh la: " +st.getDiemTrungBinh() );
		}
	}
	public void  lonNhat() {
		float max = 0;
		for (Student st : StudentList) {
			if(st.getDiemTrungBinh()>= max) max = st.getDiemTrungBinh();
			System.out.println("Điểm trung bình lớn nhất" +max);
		}
	}
}
