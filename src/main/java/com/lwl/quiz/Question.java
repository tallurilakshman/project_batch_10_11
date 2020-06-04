package com.lwl.quiz;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
	private String question;
	private List<String> options;
	private String answer;
}
