package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;

public class TraverseExample {

	public static void main(String[] args) {
		 
		ArrayList<String> names = new ArrayList<>();
		names.add("Raushan");
		names.add("Kausal");
		names.add("Sahil");
		names.add(0,"Aman");
		
		for(String str:names) {
			System.out.print(str +"\t"+ str.length()+"\t");
			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());
		}
		
		System.out.println("__________________________________________________________________");
		
		//traversing using ITERATOR : Forward traversing
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		System.out.println("__________________________________________________________________");
		
		//ListIterator : backward iterator
		ListIterator<String> litr =  names.listIterator(names.size());
		
		while(litr.hasPrevious()){
			String previous = litr.previous();
			System.out.println(previous);
		}
		System.out.println("__________________________________________________________________");
		//for each method
		names.forEach(e ->{
			System.out.println(e);
		});
		
		
		System.out.println("__________________________________________________________________");
		System.out.println("SORTING OF ELEMENTS");
		TreeSet<String> set= new TreeSet<>();
		set.addAll(names);
		set.forEach(r -> {
			System.out.println(r);
		});
	}

}
