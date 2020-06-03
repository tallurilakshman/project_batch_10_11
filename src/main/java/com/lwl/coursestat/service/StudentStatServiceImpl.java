package com.lwl.coursestat.service;

import java.util.List;
import java.util.function.Predicate;

import com.lwl.coursestat.domain.Student;
import com.lwl.coursestat.dto.PlancementCountDTO;
import com.lwl.coursestat.util.FileReaderUtil;

public class StudentStatServiceImpl implements StudentStatService {
	
	private static final String FILE_NAME = "coursedata.csv";
	private static List<Student> studentList;
	
	static {
			studentList = FileReaderUtil.getStudentDetailsFromFile(FILE_NAME);
	}
	
	@Override
	public List<Student> getStudentBy(Predicate<Student> student) {
		
		return null;
	}

	@Override
	public long getCount(Predicate<Student> predicate) {
		return studentList.stream().filter(predicate).count();
	}

	@Override
	public List<Student> search(String str) {

		return null;
	}

	@Override
	public PlancementCountDTO getPlacedAndNotPlacedCount() {
	
		return null;
	}

	@Override
	public List<String> allStudentNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
