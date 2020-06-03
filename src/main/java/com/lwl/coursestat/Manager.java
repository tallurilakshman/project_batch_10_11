package com.lwl.coursestat;

import java.util.List;

import com.lwl.coursestat.domain.PlacedStatus;
import com.lwl.coursestat.domain.Student;
import com.lwl.coursestat.service.StudentStatService;
import com.lwl.coursestat.service.StudentStatServiceImpl;
import com.lwl.coursestat.util.FileReaderUtil;

public class Manager {
	public static void main(String[] args) {
		
		List<Student> students = FileReaderUtil.getStudentDetailsFromFile("coursedata.csv");
		
		StudentStatService service = new StudentStatServiceImpl();
		
		long count = service.getCount( (student)->student.getPlacedStatus().equals(PlacedStatus.N));
		System.out.println(count);
		
	}
}
