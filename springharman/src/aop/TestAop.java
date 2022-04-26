package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("std");
		student.getAge();
		student.getId();
		student.getName();
		
		ImplementAspect call = (ImplementAspect)context.getBean("aspect");
		call.aspectCall();
		call.myMethod();
		

	}
}