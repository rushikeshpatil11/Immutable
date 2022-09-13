package CustomImmutable;

public class ImmutableTest3 {
	
	public static void main(String[] args) {
		
		Student s1=new Student(10,"Ram");
		
		System.out.println("Before ="+ s1);
		
		
		
	}
	
	

}
final class Student{
	private final int roll;
	private final String name;
	
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Student [ Roll = "+roll +", Name = "+name +"]";
	}
	
	
}
