package com.lwl.ems.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lwl.ems.domain.Employee;
import com.lwl.ems.dto.SalStat;
import com.lwl.ems.service.EmployeeService;
import com.lwl.ems.service.EmployeeServiceImpl;
import com.lwl.ems.util.DbConnectionUtil;

class EmployeeServiceTest {

	private SeedDataUtil seedDataUtil = new SeedDataUtil();

	private EmployeeService empService;

	@BeforeEach
	void clarData() {
		Connection con = null;
		Statement st = null;
		try {
			con = DbConnectionUtil.dbutil.getConnection();
			st = con.createStatement();
			st.execute("delete from emp");
			st.execute("delete from dept");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnectionUtil.dbutil.close(st, con);
		}
	}

	@Test
	public void deptSalStatTest() {
		
		empService = new EmployeeServiceImpl();
		List<Employee> list = seedDataUtil.getEmployees();
		empService.addEmployees(list);
		SalStat salSat = empService.getSalStatOfDept(10);
		System.out.println(salSat.getCount());
		System.out.println(salSat.getMax());
		assertEquals(5000, salSat.getMax());
		assertEquals(3, salSat.getCount());
		
	}
}
