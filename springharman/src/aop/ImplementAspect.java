package aop;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class ImplementAspect {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("my first aspect");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ImplementAspect call = (ImplementAspect)context.getBean("aspect");
		
		System.out.print("enter an integer : ");
		int a = sc.nextInt();
		if(a == 1) {
			throw new RuntimeException("no is one");
		}
		else {
			call.aspectCall();
		}
		
		call.myMethod();
	}

	private void myMethod() {
		System.out.println("my other method");
	}

	public void aspectCall() {
		System.out.println("applying advice for the first time");
	}

}