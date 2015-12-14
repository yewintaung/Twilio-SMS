package com.ywa.test;
import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee("one", "group one");
		Employee emp2 = new Employee("two", "group two");
		Employee emp3 = new Employee("one", "group three");
		
		List<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
		System.out.println(checkList(emps));
		
		//TODO: todo comment
		System.out.println("TODO: comment");
		
		// second time push
		System.out.println("Second Push");
	}
	
	public static boolean checkList(List<Employee> employees) {
		
		for (int i = 0; i < employees.size(); i++) {
			Employee checkObj = employees.get(i);
			
			for (int j = 0; j < employees.size(); j++) {
				if (i == j) continue;
				if (employees.get(j).getName().equals(checkObj.getName())) return false; 
			}
		}
		return true;
	}
}
