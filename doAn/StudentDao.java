package doAn;

import java.io.*;
import java.util.ArrayList;

public class StudentDao {
	public void ghiDiemThi(ArrayList<Student> studenList) {
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		try {

			fout = new FileOutputStream("d:\\thi1.bin");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(studenList);

			System.out.println("Thành công!");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public ArrayList<Student> docDiemThi(String filename) {

		ArrayList<Student> studentList = new ArrayList<>();

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		try {
			fin = new FileInputStream(filename);
			ois = new ObjectInputStream(fin);
			studentList = (ArrayList<Student>) ois.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return studentList;
	}
}