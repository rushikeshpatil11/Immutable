package CustomImmutable;

public class ImmutableTest1 {

	public static void main(String[] args) {
		Address originaladd = new Address("India", "Pune", 411033);

		Employee emp1 = new Employee(10, "Rushi", originaladd);

		System.out.println("Before =" + emp1);

		emp1.getAddress().setCity("Dubai");

		System.out.println("After  =" + emp1);
	}

}

final class Employee {
	private final int Id;
	private final String name;
	private final Address add;

	Employee(int Id, String name, Address add) {
		this.Id = Id;
		this.name = name;
		Address cloneadd = new Address();
		cloneadd.setCountry(add.getCountry());
		cloneadd.setCity(add.getCity());
		cloneadd.setPin(add.getPin());
		this.add = cloneadd;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		Address duplicateadd = new Address();
		duplicateadd.setCountry(add.getCountry());
		duplicateadd.setCity(add.getCity());
		duplicateadd.setPin(add.getPin());
		return duplicateadd;
	}

	public String toString() {
		return "Emplyoee [ ID = " + Id + " , Name = " + name + " , Address = " + add + "]";
	}
}

class Address {
	String Country;
	String City;
	int Pin;

	Address() {

	}

	Address(String Country, String City, int Pin) {
		this.Country = Country;
		this.City = City;
		this.Pin = Pin;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public int getPin() {
		return Pin;
	}

	public void setPin(int Pin) {
		this.Pin = Pin;
	}

	public String toString() {
		return "Address [ Country = " + Country + " , City = " + City + " , Pin = " + Pin + "]";
	}
}