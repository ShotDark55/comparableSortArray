package comparableSortArray.sortArray;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {

	
	public static ArrayList<String> alphabit() {
		ArrayList<String> r = new ArrayList<>();
		// you see this list not order 
		// just put random !!!
		r.add("b");
		r.add("d");
		r.add("s");
		r.add("g");
		r.add("c");
		r.add("c");
		r.add("a");
		r.add("a");
		r.add("b");
		return r;
	}

	
	public static void setSort(ArrayList<String> list) {
		Collections.sort(list);
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> alpha = alphabit();
		// before use collection.sort()
		System.out.println("before sort : "); 
		
		for (String string : alpha) {
			System.out.println(string);
		}
		
		
		System.out.println("after sort : ");
		
		// here we use collection.sort()
		setSort(alpha);
		for (String string : alpha) {
			System.out.println(string);
		}
		
		
		
		
	}
	
	
}
