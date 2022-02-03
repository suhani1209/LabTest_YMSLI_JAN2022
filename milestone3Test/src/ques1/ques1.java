package ques1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ques1 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		System.out.println("------printing map------");
		
		// 1 print map using stream
		map.entrySet()
		   .stream()
		   .forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
		
		// 2 print only that recrods that contain key contains raj
		System.out.println("------printing records with key contain raj------");
		map.entrySet()
		   .stream()
		   .filter(entry -> entry.getKey().contains("raj")).forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
		
		
		// 3 print map sorted by key
		System.out.println("------printing records sorted by key------");
		map.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByKey())
		   .forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
		
		// 4 print map sorted by values
		System.out.println("------printing records sorted by value------");
		map.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByValue())
		   .forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
		
		// 5  print map reverse sorted by the key
		System.out.println("------printing records reverse sorted by key------");
		map.entrySet()
		   .stream()
		   .sorted((a,b) -> b.getKey().compareTo(a.getKey()))
		   .forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
		
		
		
		
	}
}
