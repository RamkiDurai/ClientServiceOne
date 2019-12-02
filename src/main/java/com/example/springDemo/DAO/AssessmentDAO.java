package com.example.springDemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springDemo.domain.Question;

@Repository
public interface AssessmentDAO extends JpaRepository<Question, Long>{

}
