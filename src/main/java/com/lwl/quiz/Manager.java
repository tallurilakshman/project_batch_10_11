package com.lwl.quiz;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Employees {
	private List<Person> employees;
}

@Getter
@Setter
class Person {
	String name;
	String email;

	private Person() {

	}
}

public class Manager {
	public static void main(String[] args) {

		String data = "{\"employees\":[{\"name\":\"krish\",\"email\":\"krish@gmail.com\"},{\"name\":\"nag\",\"email\":\"nag@gmail.com\"}]}";

		ObjectMapper mapper = new ObjectMapper();
		try {
			Employees person = mapper.readValue(data, Employees.class);
			person.getEmployees().forEach(e -> {
				System.out.println(e.getName());
			});
			String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
			System.out.println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		QuizService quizService = new QuizServiceImpl();
//		quizService.startQuiz();

	}
}
