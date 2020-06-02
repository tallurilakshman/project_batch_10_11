package com.lwl.coursestat.service;

import java.util.List;
import java.util.function.Predicate;

import com.lwl.coursestat.domain.Student;
import com.lwl.coursestat.dto.PlancementCountDTO;

public interface StudentStatService {

		public List<Student> getStudentBy(Predicate<Student> student);
		public long getCount(Predicate<Student> student);
		public List<Student> search(String str);
		public PlancementCountDTO getPlacedAndNotPlacedCount();
}
