package comparableSortArray.sortArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortApp {
	
	public static void main(String[] args) {
		
		ArrayList<String> listname = new ArrayList<>();
		
		listname.add("clowse popi");
		listname.add("franz bonaparta");
		listname.add("emili chibi");
		
		// this is how to sort by what you want !
		
		System.out.println("before sort !\n");
		
		for (String string : listname) {
			System.out.println(string);
		}
	
		
		Collections.sort(listname);
		
		System.out.println("\n\nafter sort sort\n");
		
		for (String name : listname) {
			System.out.println(name);
		}
		
	}

}
