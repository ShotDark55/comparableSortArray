package comparableSortArray.sortArray;

import java.util.ArrayList;
import java.util.Collections;

public class CharExample {
	
	public static void main(String[] args) {
		
		ArrayList<Character> example = alpha();
		System.out.println("random sort : ");
		
		
		for (Character character : example) {
			System.out.println(character);
		}
		
		
		after_sort(example);
		System.out.println("sort by alphabite !!!");
		
		for (Character character : example) {
			System.out.println(character);
		}
		
	}
	
	
	
	public static ArrayList<Character> alpha () {
		ArrayList<Character> a = new ArrayList<>();
		
		// this list is not have sort
		
		a.add('z');
		a.add('x');
		a.add('b');
		a.add('c');
		a.add('a');
		a.add('d');
		
		return a;
		
	}
	
	
	public static void after_sort(ArrayList<Character> o) { 
		Collections.sort(o);
	}

}
