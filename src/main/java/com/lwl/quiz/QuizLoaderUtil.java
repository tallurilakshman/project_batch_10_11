package com.lwl.quiz;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class QuizLoaderUtil {

	private static final String JSON_FILE = "/quiz.json";

	private QuizLoaderUtil() {
	}

	public static Quiz loadDataFromJSONFile() {
		ObjectMapper objectMapper = new ObjectMapper();
		Quiz quiz = null;
		try {
			quiz = objectMapper.readValue(QuizLoaderUtil.class.getResourceAsStream(JSON_FILE), Quiz.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return quiz;
	}

	public static Quiz loadDataFromYAMLFile() {
		throw new  UnsupportedOperationException("");
	}

}
