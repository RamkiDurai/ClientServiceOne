package com.example.springDemo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "os_question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_Id")
	private Long questionId;

	@Column(name = "Question")
	private String question;

	@OneToMany(mappedBy = "question")
	private List<Answer> answerList;

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<Answer> answerList) {
		this.answerList = answerList;
	}

}
