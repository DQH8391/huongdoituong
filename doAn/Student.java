package doAn;
import java.io.Serializable;
public class Student implements Serializable{
	
	private String hoTen;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	
	private float diemTrungBinh;
	public Student(String hoTen, float diemTrungBinh) {
		super();
		this.hoTen = hoTen;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	
}
