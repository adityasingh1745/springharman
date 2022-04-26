package springharman.model;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import springharman.beans.A;  

public class Test {  
	public static void main(String[] args) {  
		Resource resource=new ClassPathResource("applicationContext.xml");
		//applicationContext.xml is my configuration file
		BeanFactory factory=new XmlBeanFactory(resource);  

		Student student = (Student)factory.getBean("studentbean");  
		Employee employee = (Employee) factory.getBean("emp");
		//im not instantiating a Student object -- new Student()
		//instead the spring is instantiating it from me and injecting it
		//employee.show();
		//student.displayInfo();  

		Question q=(Question)factory.getBean("q");  
		q.displayInfo();  

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
		A a=context.getBean("a",A.class);  
		a.display();   
	}  
}  