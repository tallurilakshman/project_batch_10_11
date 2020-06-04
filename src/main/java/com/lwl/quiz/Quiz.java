package com.lwl.quiz;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quiz {
	private String quiz;
	private List<Question> questions;
}
