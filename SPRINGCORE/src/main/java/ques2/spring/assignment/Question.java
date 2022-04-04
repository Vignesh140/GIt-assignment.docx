package ques2.spring.assignment;

import java.util.List;

public class Question {
	int questionId; 
	String question;
	
	
	List<String> answers;
	public Question(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	
	
	
	public String Display() {
		return "QuestionNumber : "+questionId+"\nQuestion : "+question+"\nAnswers : "+answers;
	}
	

}
