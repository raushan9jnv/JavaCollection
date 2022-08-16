package learn;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
	 
		
		HashMap<String,Integer> hm = new HashMap<>();
		//adding element
		hm.put("Core Java", 4000);
		hm.put("Basic python", 3500);
		hm.put("Spring",8000);
		hm.put("Android", 4000);
		hm.put("Android", 5000);   // duplicates key not allow
		hm.put("Android", 6000);
		System.out.println(hm);
		
//		hm.forEach((e1,e2)->{
//			System.out.println(e1+"=>"+e2);
//		});
		
		hm.forEach((key,value)->{
			System.out.println(key+"=>"+value);
		});
		
		System.out.println("Fee of Core Java = "+hm.get("Core Java"));

	}

}
