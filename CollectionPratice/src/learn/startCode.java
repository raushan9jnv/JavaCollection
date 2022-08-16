package learn;

import java.util.*;  //import all packages[all classes]

public class startCode {

	public static void main(String[] args) {
		 
		System.out.println("Welcome to code java collection framework");
		
		/*
		 * type safe collection : same type of elements(objects) are added
		 * untype safe collection: different types of elements can be added
		 */

		//type safe colllection
		ArrayList<String> names = new ArrayList<>();
		names.add("Raushan");
		names.add(null);
		names.add("Raushan");
		System.out.println(names);
		System.out.println(names.get(2));
		
		names.remove("Raushan");
		names.set(0, "Sahil"); //setting value
		names.add(1,"kaushal");
		System.out.println(names);
		
		//untype safe
		LinkedList list = new LinkedList();
		list.add("123");
		list.add("Raushan");
		list.add(123);
		list.add(false);
		System.out.println(list);
		System.out.println("size is " + list.size());
		System.out.println("Contain Raushan? " + list.contains("Raushan"));
		System.out.println("Contain Sahil? " + list.contains("Sahil"));
		System.out.println("is empty? " + list.isEmpty());
		
		//remove all
		list.clear();
		System.out.println("clear all   " +list);
		
		Vector<String> vector =new Vector<>();
		vector.addAll(names);
		System.out.println("vector " + vector);
		
		
		System.out.println("\n............................set..............................");
		
		HashSet<Double> nms = new HashSet<>();
		nms.add(14.14);
		nms.add(34.3);
		nms.add(new Double(3476.67));
		nms.add(99.3);
		nms.add(99.3);
		nms.add(5.3);
		System.out.println(nms);
		
		TreeSet<Double> tree = new TreeSet<>();
		tree.addAll(nms);
		System.out.println(tree);
		
		
	}

}
