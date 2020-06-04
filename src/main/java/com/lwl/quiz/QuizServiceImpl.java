package com.lwl.quiz;

import java.util.List;
import java.util.Scanner;

public class QuizServiceImpl implements QuizService {

	@Override
	public void startQuiz() {

		Quiz quiz = QuizLoaderUtil.loadDataFromJSONFile();

		if (quiz != null) {
			start(quiz);
		} else {
			System.out.println("Sorry! something went wrong... we will get back soon...");
		}
	}

	private void start(Quiz quiz) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please wait the  quiz" + quiz.getQuiz() + "is going start in few seconds..........");
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<Question> questions = quiz.getQuestions();
		int r_count = 0;
		int w_count = 0;

		for (int i = 0; i < questions.size(); i++) {
			Question question = questions.get(i);
			System.out.println(i + 1 + ". " + question.getQuestion());
			List<String> options = question.getOptions();
			String lables[] = {"A","B","C","D"};
		
			for (int j = 0; j < options.size(); j++) {
				System.out.println(lables[j]+". "+options.get(j));
			}
			System.out.println();
			String userAnswer = sc.nextLine();
			if (userAnswer.trim().equalsIgnoreCase(question.getAnswer())) {
				r_count++;
			} else {
				w_count++;
			}

		}
		showResult(questions.size(), w_count, r_count);
		sc.close();
	}

	private void showResult(int size, int w_count, int r_count) {
		System.out.println("Total question in quiz:" + size);
		System.out.println("No of questions right:" + r_count);
		System.out.println("No of question wrong :" + w_count);
		float percentage = ((r_count) /(float)size) * 100;
		System.out.println("Percentage is :" + percentage);
	}

}
