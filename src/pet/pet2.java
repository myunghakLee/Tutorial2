package pet;

public class pet2 {
	private String name;
	private int age; // in year
	private double weight; //in pounds
	
        // 오버라이딩
	public String toString() {
		return ("Name: " + name + " Age: " + age + " years"
				+ "\nWeight: " + weight + " pounds");
	}
	
	public pet2(String initialName, int initialAge, double initialWeight) {
		 // 구현하시오.
		
		name = initialName;
		
		
	}
        // 오버로딩
	public pet2(String initialName) {
		name = initialName;
		age = 0;
		weight = 0;
	}
	
	public pet2( int initialAge) {
		name = "No name yet.";
		weight = 0;
		if (initialAge < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			age = initialAge;
	}
	public pet2() {
		name = "No name yet.";
		age = 0;
		weight = 0;
	}
	public void set(String newName, int newAge, double newWeight) {
		 // 구현 하시오.
	}
	
	public void setAge( int newAge) {
        age= newAge;       
		// this.age = newAge  도 가능
		// 구현하시오.
	}
	
	public void setWeight( double newWeight) {
		 weight= newWeight;       
		 
			 }
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return 0;
		// 구현하시오.
	}
	
	public double getWeight() {
		// 구현하시오.
	}
}