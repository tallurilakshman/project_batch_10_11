package com.lwl.ems.test;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lwl.ems.domain.Dept;
import com.lwl.ems.domain.Employee;

public class SeedDataUtil {

	public List<Employee> getEmployees() {
		ObjectMapper obj = new ObjectMapper();
		List<Employee> empList=new ArrayList<Employee>();
		try {
			empList = obj.readValue(this.getClass().getResourceAsStream("/emp_test.json"), new TypeReference<List<Employee>>() {});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	public List<Dept> getDeptDetails() {
		ObjectMapper obj = new ObjectMapper();
		List<Dept> deptList=new ArrayList<Dept>();
		try {
			deptList = obj.readValue(this.getClass().getResourceAsStream("/dept_test.json"), new TypeReference<List<Dept>>() {});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deptList;
	}
}
