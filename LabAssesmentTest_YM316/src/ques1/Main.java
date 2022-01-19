package ques1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Merchandises> list=new ArrayList<>();
		try {
			
			BufferedReader br=new BufferedReader(new FileReader(new File("input")));
			String line=null;
			while((line=br.readLine())!=null) {
				String [] token=line.split(" ");
				Merchandises m=new Merchandises(token[0],Integer.parseInt(token[1]),Double.parseDouble(token[2]));
				list.add(m);
			}
			
			
			
			br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		print(list);
		
		System.out.println("------------------------------------------");
		System.out.println("Sorted on the basis of item id : ");
		
		Collections.sort(list, new SortAsPerItemCode());
		print(list);
		
		System.out.println("------------------------------------------");
		System.out.println("Sorted on the basis of price of item : ");
		
		Collections.sort(list, new SortAsPerPrice());
		print(list);
		
		
	}

	private static void print(List<Merchandises> list) {
		for(Merchandises x: list) {
			System.out.println(x);
		}
		System.out.println();
	}
}
