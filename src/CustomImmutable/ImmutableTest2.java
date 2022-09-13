package CustomImmutable;

public class ImmutableTest2 {

	public static void main(String[] args) {

		Test t1=new Test(10);
		Test t2=t1.modify(100);
		Test t3=t1.modify(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
	}

}
final class Test{
	private final int roll;
	Test(int roll){
		this.roll=roll;
	}
	public Test modify(int roll) {
		if(this.roll==roll)
			return this;
		else
			return new Test(roll);
	}
}
