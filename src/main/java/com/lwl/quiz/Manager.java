package com.lwl.quiz;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class Employees{
	private List<Person> employees;
}
@Getter
@Setter
class Person{
	String name;
	String email;
	private Person() {
		
	}
}
public class Manager {
	public static void main(String[] args) {
		QuizService service = new QuizServiceImpl();
		service.startQuiz();
		
	}
}
