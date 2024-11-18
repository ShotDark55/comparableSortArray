package comparableSortArray.sortArray;

import java.util.ArrayList;
import java.util.Collections;

public class SortObject {
	
	public static ArrayList<Person> personList() {
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("FRANZPONAPARTA", 60));
		list.add(new Person("yohan", 22));
		list.add(new Person("tima", 35));
		list.add(new Person("clows popy", 60));
		list.add(new Person("nina", 22));
		
		
		
		
		return list;
	}
	
	public static void main(String[] args) {
		
		// before ordering  (Default)
		System.out.println("before sort : \n");
		
		ArrayList<Person> persons = personList();
		
		for (Person person : persons) {
			System.out.println(person.getPerson());
		}
		
		
		// after ordering (change) sort apply .....
		// go to person class and implement Comparable ....
		
		Collections.sort(persons);
		
		System.out.println("after sort : \n");
		
		
		
		for (Person person : persons) {
			System.out.println(person.getPerson());
		}
		
		
		ArrayList<String> l = new ArrayList<>();
		
		for (Person person : persons) {
			l.add(person.name);
			
		}
		
		 
		
	}
	
	
	

}
