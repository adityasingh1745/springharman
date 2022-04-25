package springharman.model;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Test {  
	public static void main(String[] args) {  
		 
		
		
		for(int i=0; i<10; i++) {
			Resource resource=new ClassPathResource("applicationContext.xml");
			//applicationContext.xml is my configuration file
			BeanFactory factory=new XmlBeanFactory(resource); 

		//im not instantiating a Student object -- new Student()
		//instead the spring is instantiating it from me and injecting it
		
			
			try {
				Thread.sleep(2000);
				Student student = (Student)factory.getBean("studentbean");  

				student.displayInfo();  

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  
}