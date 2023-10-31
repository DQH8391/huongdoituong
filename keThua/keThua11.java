package keThua;

public class keThua11 extends keThua1 {
	private static float bonus;

	public static float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	

	public keThua11(float bonus, float salary) {
		super(salary);
		this.bonus = bonus;
	}
	public static float ThucNhan() {
		return getSalary()+getBonus();
	}
}
