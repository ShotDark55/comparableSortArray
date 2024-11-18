package comparableSortArray.sortArray;

public class Person implements Comparable<Person>{
	
	public String name;
	private int age;
	
	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getPerson() {
		
		String d = "";
		d += "name : " + name + "\n" ;
		d += "age : " + age + "\n" ;
		
		return d;
	}


	@Override
	public int compareTo(Person o) {
		return o.age - this.age;
	}
	
	

}
