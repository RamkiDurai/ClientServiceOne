package com.example.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDemo.Service.AssessmentService;
import com.example.springDemo.domain.Question;

@RestController
@CrossOrigin
public class AssessmentController {
	
	@Autowired
	AssessmentService assessmentService;
	
	@GetMapping("/getQuestionList")
	public List<Question> getQuestionList(){
		return assessmentService.getQuestionList();
	}

}
