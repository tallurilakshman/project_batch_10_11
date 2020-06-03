package com.lwl.coursestat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.lwl.coursestat.domain.Student;
import com.lwl.coursestat.dto.PlancementCountDTO;
import com.lwl.coursestat.util.FileReaderUtil;

public class StudentStatServiceImpl implements StudentStatService {

	private static final Logger log = Logger.getLogger(StudentStatServiceImpl.class.getName());

	private static final String FILE_NAME = "coursedata.csv";
	private static List<Student> studentList;
	static {
		studentList = FileReaderUtil.getStudentDetailsFromFile(FILE_NAME);
	}

	@Override
	public List<Student> getStudentBy(Predicate<Student> predicate) {
		return null;
	}

	@Override
	public long getCount(Predicate<Student> predicate) {
		return studentList.stream().filter(predicate).count();
	}

	@Override
	public List<Student> search(String str) {
		List<Student> list = new ArrayList<Student>();
		if (str != null) {
			String searchStr = str.toLowerCase();
			list = studentList.stream().filter(s -> s.getName().toLowerCase().contains(searchStr))
					.collect(Collectors.toList());
			log.info("Total students found for the given search string" + str + " is :" + list.size());
		} else {
			log.info("Search string is empty or null");
		}
		return list;
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
