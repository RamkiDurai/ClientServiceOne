package com.example.springDemo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springDemo.DAO.AssessmentDAO;
import com.example.springDemo.domain.Question;

@Service
@Transactional
public class AssessmentService {
	
	@Autowired
	AssessmentDAO assessmentDAO;

	public List<Question> getQuestionList() {
		// TODO Auto-generated method stub
		return assessmentDAO.findAll();
	}

}
