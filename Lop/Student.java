package Lop;

//thuoctinh
public class Student {
			private int id;
			private String name;
			private float gpa;
			public String getXl() {
				return xl;
			}
			public void setXl(String xl) {
				this.xl = xl;
			}
			private String kq,xl;
			private float ln;
			
		public float getLn() {
				return ln;
			}
			public void setLn(float ln) {
				this.ln = ln;
			}
		public String getKq() {
				return kq;
			}
			public void setKq(String kq) {
				this.kq = kq;
			}
		public  void input(int id,String name, float gpa) {
			this.id=id;
			this.name=name;
			this.gpa=gpa;
			
		}
		//phuong thuc	
		public void display() {
				System.out.println(id+" "+name+" "+gpa);
			}
		public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public float getGpa() {
				return gpa;
			}
			public void setGpa(float gpa) {
				this.gpa = gpa;
			}
			//constructor
			public Student(int id, String name, float gpa) {
		
				this.id = id;
				this.name = name;
				this.gpa = gpa;
			}
			//cho phép không điền dữ liệu
			public Student() {}
			
			

}
