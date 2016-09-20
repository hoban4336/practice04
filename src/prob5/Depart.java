package prob5;

public class Depart extends Employee {
	String dept;
	public Depart(String name, int i , String dept) {
		
		super(name,i);
		this.dept = dept;
	}
	
	@Override
	public void getInformation() {
		//super.getInformation();
		System.out.printf( "이름: %s   연봉: %d  부서: %s", super.getName(), super.getSalary(), dept );
	}
}
