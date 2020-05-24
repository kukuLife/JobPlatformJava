package com.jobplatform.task.entity;

public class Task {

	public String taskId;
	public String taskContent;
	public String taskAnswer;
	public String taskKeyWord;
	public String createDateTime;
	public String updateDateTime;
	
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	public String getTaskAnswer() {
		return taskAnswer;
	}
	public void setTaskAnswer(String taskAnswer) {
		this.taskAnswer = taskAnswer;
	}
	public String getTaskKeyWord() {
		return taskKeyWord;
	}
	public void setTaskKeyWord(String taskKeyWord) {
		this.taskKeyWord = taskKeyWord;
	}
	public String getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	
	
}
