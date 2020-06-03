package com.lwl.coursestat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.lwl.coursestat.domain.PlacedStatus;
import com.lwl.coursestat.domain.Student;
import com.lwl.coursestat.service.StudentStatService;
import com.lwl.coursestat.service.StudentStatServiceImpl;
import com.lwl.coursestat.util.FileReaderUtil;



public class Manager {
	public static void main(String[] args) {

		/*
		 * List<Student> students =
		 * FileReaderUtil.getStudentDetailsFromFile("coursedata.csv");
		 * System.out.println(students); StudentStatService service = new
		 * StudentStatServiceImpl(); long count = service.getCount((student) ->
		 * student.getPlacedStatus().equals(PlacedStatus.N)); System.out.println(count);
		 */
		List<Integer> numbers = new Random().ints(100, 10, 100).boxed().collect(Collectors.toList());
		System.out.println(numbers);

		// Even number
		// Prime number
		// which are divisible by 3
		// Which are divisible by 3 but not 9
		Predicate<Integer> evenPredicate = (t) -> t % 2 == 0;
		Predicate<Integer> primePredicate = (t) -> isPrime(t);
		Predicate<Integer> divisibleby3 = (t) -> t % 3 == 0;
		
		filterData(numbers, (t) -> t % 3 == 0).forEach(System.out::println);
	}

	private static boolean isPrime(Integer num) {
		if(num <= 1)
			return false;
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static List<Integer> filterData(List<Integer> list,Predicate<Integer> predicate) {
			return list.stream().filter(predicate).collect(Collectors.toList());
	}
	

}
