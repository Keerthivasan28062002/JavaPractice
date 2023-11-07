package com.encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Keerthivasan";
		emp.deptName="Developer";
		emp.location="Chennai";
		emp.setId(1117);
		System.out.println(emp.name);
		System.out.println(emp.deptName);
		System.out.println(emp.location);
		System.out.println(emp.getId());

	}

}
