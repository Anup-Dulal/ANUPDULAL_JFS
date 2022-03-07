package Collections_Example;

public class Questions {
	
	private String questionId;
	private String questions;
	private Map_Class List;
	
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public Map_Class getList() {
		return List;
	}
	public void setList(Map_Class list) {
		List = list;
	}
	public void display() {
		System.out.println("Question id: "+getQuestionId());
		System.out.println("Question: "+getQuestions());
		System.out.println("Answer: "+getList().getM());
	}
	

}
