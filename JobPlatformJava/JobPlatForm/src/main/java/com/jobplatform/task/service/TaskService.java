package com.jobplatform.task.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobplatform.task.entity.Task;
import com.jobplatform.task.mapper.TaskMapper;

@Service
public class TaskService {

	@Autowired
	public TaskMapper taskMapper;
	
	public List<Task> getTask(String taskKeyWord) {
		// TODO Auto-generated method stub
		return taskMapper.select(taskKeyWord);
	}
	
	
	public String processResult(String taskAnswer) {
		
		String processResult = "";

		this.saveJavaFile(taskAnswer);
		processResult = this.compileAndRun(taskAnswer);
		
		return processResult;
	}
	
	
	private void saveJavaFile(String taskAnswer) {
		taskAnswer = "package com.jobplatform.temp;" + "\n" + taskAnswer;
		FileWriter writer;
		try {
			FileWriter fileWriter = new FileWriter("/Users/kukuLife/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/jJobPlatForm/src/main/java/com/jobplatform/temp/Test.java", false);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(taskAnswer);
			bufferedWriter.close();
			fileWriter.close();
			
		} catch (IOException e) {
			
		}
	}
	
	
	private String compileAndRun (String taskAnswer) {
		JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
		int status = javac.run(null, null, null, "-d", "/Users/kukuLife/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/jJobPlatForm/src/main/java/com/jobplatform/temp","/Users/kukuLife/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/jJobPlatForm/src/main/java/com/jobplatform/temp/Test.java");
		String result = "";
		
		 if(status!=0){
			 System.out.println("没有编译成功！");
			 return "failure";
		 }
		 
		 try {
			//ToolProvider.getSystemToolClassLoader().getSystemClassLoader().loadClass("/Users/kukuLife/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/jJobPlatForm/target/classes/com/jobplatform/temp/Test.class");
			Class clz = Class.forName("com.jobplatform.temp.Test");
			Object o = clz.newInstance();
			Method method = clz.getMethod("main", String[].class);
			result= (String)method.invoke(o, new Object[]{new String[]{}});
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure";
		} 
		 
		if(result != null) {
			return result;
		} 
		return "success";
	}
	
	
	public void updateTaskAnswer(String taskId, String taskAnswer) {
		// TODO Auto-generated method stub
		taskMapper.updateTaskAnswer(taskId, taskAnswer);
	}
	

}
