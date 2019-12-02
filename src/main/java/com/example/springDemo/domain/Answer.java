package com.example.springDemo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "os_answer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "answer_Id")
	private Long answerId;

	@Column(name = "Answer")
	private String answer;

	@Column(name = "is_correct_answer")
	private boolean isCorrectAnswer;

	@ManyToOne
	@JoinColumn(name = "question_Id")
	private Question question;

	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isCorrectAnswer() {
		return isCorrectAnswer;
	}

	public void setCorrectAnswer(boolean isCorrectAnswer) {
		this.isCorrectAnswer = isCorrectAnswer;
	}

	@JsonIgnore
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
