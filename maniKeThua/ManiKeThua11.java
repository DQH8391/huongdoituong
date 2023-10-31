package maniKeThua;
import keThua.keThua11;

public class ManiKeThua11 {
	public static void mani(String[] args) {
		keThua11 p = new keThua11 (1000000, 500000);
		System.out.println("Luong là: " +p.getSalary());
		System.out.println("Thưởng là: " +p.getBonus());
		System.out.println("Luong là: "+keThua11.ThucNhan());
		
	}
}
