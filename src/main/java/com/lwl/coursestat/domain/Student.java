package com.lwl.coursestat.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
	private String name;
	private String batch;
	private CCStatus ccStatus;
	private PlacedStatus placedStatus;
	private String degree;
	private float score;
}
