package springharman.model;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Test {  
	public static void main(String[] args) {  
		Student student;
		Employee employee;
		for(int i=0; i<10; i++) {
			Resource resource=new ClassPathResource("applicationContext.xml");
			//applicationContext.xml is my configuration file
			BeanFactory factory=new XmlBeanFactory(resource);  

			student = (Student)factory.getBean("studentbean");  
			employee = (Employee) factory.getBean("emp");

			try {
				Thread.sleep(3000);
				student = (Student)factory.getBean("studentbean");  
				employee = (Employee) factory.getBean("emp");
				employee.show();

			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}  
}  