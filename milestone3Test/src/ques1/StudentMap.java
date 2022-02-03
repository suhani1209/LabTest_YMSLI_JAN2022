package ques1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentMap {
	public static void main(String[] args) {
		Map<Student, Integer> map=new HashMap<>();
		map.put(new Student(109, "raj", 95), 95);
		map.put(new Student(61, "keta", 78), 78);
		map.put(new Student(11, "gunika", 98), 98);
		map.put(new Student(19, "keshav", 97), 97);
		
		// 1  Print all records sorted as per name of the student
		System.out.println("------sorted by name------");
		map.entrySet()
		   .stream()
		   .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
		   .forEach(student -> System.out.println(student));
		
		System.out.println();
		// 2  Print all records as per id of the student
		System.out.println("------sorted by id ------");
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
		.forEach(student-> System.out.println(student));
	}
}
